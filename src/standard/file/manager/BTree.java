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
}
