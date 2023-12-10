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

    public BTreeNode getRoot() {
        return root;
    }

    public BTree(int order) {
        this.root = new BTreeNode();
        this.order = order;
    }

    public void insert(Llave key) {
        if (root.keys.size() == order - 1) {
            BTreeNode newRoot = new BTreeNode();
            newRoot.children.add(root);
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

        parentNode.keys.add(childIndex, childNode.keys.get(order / 2));
        parentNode.children.add(childIndex + 1, newChildNode);

        newChildNode.keys.addAll(childNode.keys.subList(order / 2 + 1, order - 1));
        childNode.keys.subList(order / 2, order - 1).clear();

        if (!childNode.children.isEmpty()) {
            newChildNode.children.addAll(childNode.children.subList(order / 2 + 1, order));
            childNode.children.subList(order / 2 + 1, order).clear();
        }
    }

    public int search(String key, BTreeNode temp) {
        if (temp == null) {
            temp = root;
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

    public void printBTree(BTreeNode node, String prefix, boolean isLeft) {
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

    public void delete(Llave key) {
        delete(root, key);
    }

    private void delete(BTreeNode node, Llave key) {
        if (node == null) {
            return;
        }

        int index = findKeyIndex(node, key);

        // Eliminar la llave si se encuentra en el nodo actual
        if (index != -1 && key.getId().equals(node.keys.get(index).getId())) {
            if (!node.children.isEmpty()) {
                // Nodo interno
                Llave predecessor = findPredecessor(node, index);
                node.keys.set(index, predecessor);
                delete(node.children.get(index), predecessor);
            } else {
                // Nodo hoja
                node.keys.remove(index);
            }
        } else {
            // La llave no está en el nodo actual
            int childIndex = findChildIndex(node, key);
            boolean merged = false;

            if (childIndex < node.children.size()) {
                // Descender al hijo correspondiente
                BTreeNode child = node.children.get(childIndex);
                if (child.keys.size() == (order / 2) - 1) {
                    // Fusionar con el hermano derecho si es necesario
                    merged = mergeWithRightSibling(node, childIndex);
                }

                if (!merged) {
                    // Si no se fusiona con el hermano derecho, descender al hijo correspondiente
                    delete(child, key);
                }
            } else {
                // Descender al último hijo
                BTreeNode child = node.children.get(node.children.size() - 1);
                if (child.keys.size() == (order / 2) - 1) {
                    // Fusionar con el hermano izquierdo si es necesario
                    merged = mergeWithLeftSibling(node, node.children.size() - 1);
                }

                if (!merged) {
                    // Si no se fusiona con el hermano izquierdo, descender al último hijo
                    delete(child, key);
                }
            }
        }

        // Ajustar el árbol si es necesario
        adjustTree(node);
    }

    private int findKeyIndex(BTreeNode node, Llave key) {
        for (int i = 0; i < node.keys.size(); i++) {
            if (key.getId().compareTo(node.keys.get(i).getId()) == 0) {
                return i;
            }
        }
        return -1;
    }

    private int findChildIndex(BTreeNode node, Llave key) {
        int i;
        for (i = 0; i < node.keys.size(); i++) {
            if (key.getId().compareTo(node.keys.get(i).getId()) < 0) {
                return i;
            }
        }
        return i;
    }

    private Llave findPredecessor(BTreeNode node, int index) {
        BTreeNode current = node.children.get(index);
        while (!current.children.isEmpty()) {
            current = current.children.get(current.children.size() - 1);
        }
        return current.keys.get(current.keys.size() - 1);
    }

    private boolean mergeWithRightSibling(BTreeNode parentNode, int childIndex) {
        if (childIndex < parentNode.children.size() - 1) {
            BTreeNode currentChild = parentNode.children.get(childIndex);
            BTreeNode rightSibling = parentNode.children.get(childIndex + 1);

            if (rightSibling.keys.size() > (order / 2) - 1) {
                // Mover una llave del hermano derecho y su hijo asociado al nodo actual
                currentChild.keys.add(parentNode.keys.get(childIndex));
                currentChild.keys.addAll(rightSibling.keys.subList(0, 1));
                rightSibling.keys.subList(0, 1).clear();

                if (!rightSibling.children.isEmpty()) {
                    currentChild.children.add(rightSibling.children.get(0));
                    rightSibling.children.remove(0);
                }

                parentNode.keys.set(childIndex, rightSibling.keys.get(0));
                rightSibling.keys.remove(0);

                return true;
            }
        }
        return false;
    }

    private boolean mergeWithLeftSibling(BTreeNode parentNode, int childIndex) {
        if (childIndex > 0) {
            BTreeNode currentChild = parentNode.children.get(childIndex);
            BTreeNode leftSibling = parentNode.children.get(childIndex - 1);

            if (leftSibling.keys.size() > (order / 2) - 1) {
                // Mover una llave del hermano izquierdo y su hijo asociado al nodo actual
                currentChild.keys.add(0, parentNode.keys.get(childIndex - 1));
                parentNode.keys.set(childIndex - 1, leftSibling.keys.get(leftSibling.keys.size() - 1));
                leftSibling.keys.remove(leftSibling.keys.size() - 1);

                if (!leftSibling.children.isEmpty()) {
                    currentChild.children.add(0, leftSibling.children.get(leftSibling.children.size() - 1));
                    leftSibling.children.remove(leftSibling.children.size() - 1);
                }

                return true;
            }
        }
        return false;
    }

    private void adjustTree(BTreeNode node) {
        if (node.keys.size() < (order / 2) - 1 && node != root) {
            BTreeNode parentNode = findParent(root, node);
            int childIndex = findChildIndex(parentNode, node.keys.get(0));
            boolean adjusted = false;

            if (childIndex < parentNode.children.size() - 1) {
                // Intentar tomar una llave del hermano derecho
                adjusted = borrowFromRightSibling(parentNode, childIndex);
            }

            if (!adjusted && childIndex > 0) {
                // Intentar tomar una llave del hermano izquierdo
                borrowFromLeftSibling(parentNode, childIndex - 1);
            }

            if (!adjusted) {
                // Fusionar con el hermano derecho si no se puede tomar una llave del hermano derecho o izquierdo
                mergeWithRightSibling(parentNode, childIndex);
            }
        }
    }

    private boolean borrowFromRightSibling(BTreeNode parentNode, int childIndex) {
        BTreeNode currentChild = parentNode.children.get(childIndex);
        BTreeNode rightSibling = parentNode.children.get(childIndex + 1);

        if (rightSibling.keys.size() > (order / 2) - 1) {
            // Tomar una llave del hermano derecho
            currentChild.keys.add(parentNode.keys.get(childIndex));
            parentNode.keys.set(childIndex, rightSibling.keys.get(0));
            rightSibling.keys.remove(0);

            if (!rightSibling.children.isEmpty()) {
                currentChild.children.add(rightSibling.children.get(0));
                rightSibling.children.remove(0);
            }

            return true;
        }

        return false;
    }

    private void borrowFromLeftSibling(BTreeNode parentNode, int leftSiblingIndex) {
        BTreeNode currentChild = parentNode.children.get(leftSiblingIndex + 1);
        BTreeNode leftSibling = parentNode.children.get(leftSiblingIndex);

        // Tomar una llave del hermano izquierdo
        currentChild.keys.add(0, parentNode.keys.get(leftSiblingIndex));
        parentNode.keys.set(leftSiblingIndex, leftSibling.keys.get(leftSibling.keys.size() - 1));
        leftSibling.keys.remove(leftSibling.keys.size() - 1);

        if (!leftSibling.children.isEmpty()) {
            currentChild.children.add(0, leftSibling.children.get(leftSibling.children.size() - 1));
            leftSibling.children.remove(leftSibling.children.size() - 1);
        }
    }

    private BTreeNode findParent(BTreeNode current, BTreeNode child) {
        if (current.children.contains(child)) {
            return current;
        } else {
            for (BTreeNode c : current.children) {
                BTreeNode result = findParent(c, child);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }
}
