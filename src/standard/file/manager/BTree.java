/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package standard.file.manager;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class BTree implements Serializable {

    private BTreeNode root;
    private int order; // Orden del árbol B
    private boolean isLlave;
    private boolean isSecundaria;
    private String name;

    public BTreeNode getRoot() {
        return root;
    }

    public boolean getIsLlave() {
        return isLlave;
    }

    public boolean getIsSecundaria() {
        return isSecundaria;
    }

    public String getName() {
        return name;
    }

    public BTree(int order, boolean  isLlave, boolean isSecundaria, String name) {
        this.root = new BTreeNode();
        this.order = order;
        this.isLlave = isLlave;
        this.isSecundaria = isSecundaria;
        this.name = name;
    }

    public void insert(Llave key) {
        if (root.keys.size() == order - 1) {
            BTreeNode newRoot = new BTreeNode();
            newRoot.children.add(root);
            root.parent = newRoot;
            splitChild(newRoot, 0);
            root = newRoot;
        }
        insertNonFull(root, key);
    }

    private void insertNonFull(BTreeNode node, Llave key) {
        int i = node.keys.size() - 1;

        if (node.children.isEmpty()) {
            while (i >= 0 && key.getId().compareTo(node.keys.get(i).getId()) < 0) {
                i--;
            }
            node.keys.add(i + 1, key);
        } else {
            while (i >= 0 && key.getId().compareTo(node.keys.get(i).getId()) < 0) {
                i--;
            }
            i++;

            if (node.children.get(i).keys.size() == order - 1) {
                splitChild(node, i);
                if (key.getId().compareTo(node.keys.get(i).getId()) > 0) {
                    i++;
                }
            }
            insertNonFull(node.children.get(i), key);
        }
    }

    private void splitChild(BTreeNode parentNode, int childIndex) {
        BTreeNode childNode = parentNode.children.get(childIndex);
        BTreeNode newChildNode = new BTreeNode();

        int midIndex = (order - 1) / 2;
        if ((order - 1) % 2 == 0) { 
            midIndex--;
        }

        parentNode.keys.add(childIndex, childNode.keys.get(midIndex));
        parentNode.children.add(childIndex + 1, newChildNode);

        newChildNode.keys.addAll(childNode.keys.subList(midIndex + 1, order - 1));
        childNode.keys.subList(midIndex, order - 1).clear();

        if (!childNode.children.isEmpty()) {
            newChildNode.children.addAll(childNode.children.subList(midIndex + 1, order));
            childNode.children.subList(midIndex + 1, order).clear();
        }
        
        newChildNode.parent = parentNode;
        childNode.parent = parentNode;
    }

    public int search(String key) {
        return this.search(key, root);
    }

    private int search(String key, BTreeNode temp) {
        if (temp == null) {
            return -1;
        }
        int i = temp.keys.size() - 1;

        if (temp.children.isEmpty()) {
            while (i >= 0 && key.compareTo(temp.keys.get(i).getId()) != 0) {
                i--;
            }
            if (i == -1) {
                return -1;
            }
            return temp.keys.get(i).getRnn();
        } else {
            while (i >= 0 && key.compareTo(temp.keys.get(i).getId()) != 0) {
                i--;
            }
            if (i == -1) {
                i = temp.keys.size() - 1;
                while (i >= 0 && key.compareTo(temp.keys.get(i).getId()) < 0) {
                    i--;
                }
                i++;
                return search(key, temp.children.get(i));
            }
            return temp.keys.get(i).getRnn();
        }
    }

    public void printBTree() {
        this.printBTree(root, "", true);
    }

    private void printBTree(BTreeNode node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.keys);

            if (!node.children.isEmpty()) {
                for (int i = 0; i < node.children.size() - 1; i++) {
                    printBTree(node.children.get(i), prefix + (isLeft ? "│   " : "    "), true);
                }
                printBTree(node.children.get(node.children.size() - 1), prefix + (isLeft ? "│   " : "    "), false);
            }
        }
    }

    public void delete(String key) {
        delete(root, key);
    }

    private void delete(BTreeNode node, String key) {
        if (node == null) {
            System.out.println("La clave no existe en el árbol.");
            return;
        }

        deleteInternal(node, key);

        if (root.keys.isEmpty() && !root.children.isEmpty()) {
            root = root.children.get(0);
        }
    }

    private void deleteInternal(BTreeNode node, String key) {
        int index = findKeyIndex(node, key);

        if (index != -1) {
            if (!node.children.isEmpty()) {
                deleteInternalWithChildren(node, index);
            } else {
                node.keys.remove(index);
            }
        } else {
            int childIndex = findChildIndex(node, key);
            BTreeNode child = node.children.get(childIndex);

            if (child.keys.size() == order - 1) {
                handleMinimumKeys(child, childIndex);
            }

            deleteInternal(child, key);
        }
    }

    private void deleteInternalWithChildren(BTreeNode node, int index) {
        Llave key = node.keys.get(index);
        BTreeNode predecessorChild = node.children.get(index);
        BTreeNode successorChild = node.children.get(index + 1);

        if (predecessorChild.keys.size() >= (order + 1) / 2) {
            Llave predecessor = getPredecessor(predecessorChild);
            deleteInternal(predecessorChild, predecessor.getId());
            node.keys.set(index, predecessor);
        }
        else if (successorChild.keys.size() >= (order + 1) / 2) {
            Llave successor = getSuccessor(successorChild);
            deleteInternal(successorChild, successor.getId());
            node.keys.set(index, successor);
        }
        else {
            mergeNodes(node, index);
            deleteInternal(predecessorChild, key.getId());
        }
    }

    private int findKeyIndex(BTreeNode node, String key) {
        int index = 0;
        while (index < node.keys.size() && key.compareTo(node.keys.get(index).getId()) > 0) {
            index++;
        }
        return (index < node.keys.size() && key.compareTo(node.keys.get(index).getId()) == 0) ? index : -1;
    }

    private int findChildIndex(BTreeNode node, String key) {
        int index = 0;
        while (index < node.keys.size() && key.compareTo(node.keys.get(index).getId()) > 0) {
            index++;
        }
        return index;
    }

    private Llave getPredecessor(BTreeNode node) {
        while (!node.children.isEmpty()) {
            node = node.children.get(node.children.size() - 1);
        }
        return node.keys.get(node.keys.size() - 1);
    }

    private Llave getSuccessor(BTreeNode node) {
        while (!node.children.isEmpty()) {
            node = node.children.get(0);
        }
        return node.keys.get(0);
    }

    private void handleMinimumKeys(BTreeNode node, int childIndex) {
        BTreeNode leftSibling = (childIndex > 0) ? node.parent.children.get(childIndex - 1) : null;
        BTreeNode rightSibling = (childIndex < node.parent.children.size() - 1) ? node.parent.children.get(childIndex + 1) : null;

        if (leftSibling != null && leftSibling.keys.size() >= (order + 1) / 2) {
            borrowFromLeftSibling(node, leftSibling, childIndex);
        }
        else if (rightSibling != null && rightSibling.keys.size() >= (order + 1) / 2) {
            borrowFromRightSibling(node, rightSibling, childIndex);
        }
        else if (leftSibling != null) {
            mergeNodes(node.parent, childIndex - 1);
        }
        else if (rightSibling != null) {
            mergeNodes(node.parent, childIndex);
        }
    }

    private void borrowFromLeftSibling(BTreeNode node, BTreeNode leftSibling, int childIndex) {
        Llave parentKey = node.parent.keys.get(childIndex - 1);
        Llave borrowedKey = leftSibling.keys.remove(leftSibling.keys.size() - 1);

        node.keys.add(0, parentKey);
        node.parent.keys.set(childIndex - 1, borrowedKey);

        if (!leftSibling.children.isEmpty()) {
            BTreeNode borrowedChild = leftSibling.children.remove(leftSibling.children.size() - 1);
            node.children.add(0, borrowedChild);
            borrowedChild.parent = node;
        }
    }

    private void borrowFromRightSibling(BTreeNode node, BTreeNode rightSibling, int childIndex) {
        Llave parentKey = node.parent.keys.get(childIndex);
        Llave borrowedKey = rightSibling.keys.remove(0);

        node.keys.add(parentKey);
        node.parent.keys.set(childIndex, borrowedKey);

        if (!rightSibling.children.isEmpty()) {
            BTreeNode borrowedChild = rightSibling.children.remove(0);
            node.children.add(borrowedChild);
            borrowedChild.parent = node;
        }
    }

    private void mergeNodes(BTreeNode parentNode, int childIndex) {
        BTreeNode leftChild = parentNode.children.get(childIndex);
        BTreeNode rightChild = parentNode.children.get(childIndex + 1);

        Llave parentKey = parentNode.keys.remove(childIndex);
        leftChild.keys.add(parentKey);
        leftChild.keys.addAll(rightChild.keys);

        if (!rightChild.children.isEmpty()) {
            leftChild.children.addAll(rightChild.children);
            for (BTreeNode child : rightChild.children) {
                child.parent = leftChild;
            }
        }

        parentNode.children.remove(childIndex + 1);
    }
}
