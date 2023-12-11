/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package standard.file.manager;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class BTree2 {

    private BTree2Node root;
    private int order; // Orden del árbol B

    public BTree2Node getRoot() {
        return root;
    }

    public BTree2(int order) {
        this.root = new BTree2Node();
        this.order = order;
    }

    public void insert(Llave key) {
        int insetoLlave = this.searchAndInsert(key);
        if (insetoLlave == 1) {
            return;
        }
        if (root.keys.size() == order - 1) {
            BTree2Node newRoot = new BTree2Node();
            newRoot.children.add(root);
            splitChild(newRoot, 0);
            root = newRoot;
        }
        insertNonFull(root, key);
    }

    private void insertNonFull(BTree2Node node, Llave key) {
        int i = node.keys.size() - 1;

        if (node.children.isEmpty()) {
            while (i >= 0 && key.getId().compareTo(node.keys.get(i).getId()) < 0) {
                i--;
            }
            node.keys.add(i + 1, new Llave2(key.getId(), key.getRnn()));
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

    private void splitChild(BTree2Node parentNode, int childIndex) {
        BTree2Node childNode = parentNode.children.get(childIndex);
        BTree2Node newChildNode = new BTree2Node();

        parentNode.keys.add(childIndex, childNode.keys.get(order / 2));
        parentNode.children.add(childIndex + 1, newChildNode);

        newChildNode.keys.addAll(childNode.keys.subList(order / 2 + 1, order - 1));
        childNode.keys.subList(order / 2, order - 1).clear();

        if (!childNode.children.isEmpty()) {
            newChildNode.children.addAll(childNode.children.subList(order / 2 + 1, order));
            childNode.children.subList(order / 2 + 1, order).clear();
        }
    }

    public int searchAndInsert(Llave key) {
        return this.searchAndInsert(key, root);
    }

    private int searchAndInsert(Llave key, BTree2Node temp) {
        if (temp == null) {
            return -1;
        }
        int i = temp.keys.size() - 1;

        if (temp.children.isEmpty()) {
            while (i >= 0 && key.getId().compareTo(temp.keys.get(i).getId()) != 0) {
                i--;
            }
            if (i == -1) {
                return -1;
            }
            temp.keys.get(i).setRnn(key.getRnn());
            return 1;
        } else {
            while (i >= 0 && key.getId().compareTo(temp.keys.get(i).getId()) != 0) {
                i--;
            }
            if (i == -1) {
                i = temp.keys.size() - 1;
                while (i >= 0 && key.getId().compareTo(temp.keys.get(i).getId()) < 0) {
                    i--;
                }
                i++;
                return searchAndInsert(key, temp.children.get(i));
            }
            temp.keys.get(i).setRnn(key.getRnn());
            return 1;
        }
    }

    public void printBTree() {
        this.printBTree(root, "", true);
    }

    private void printBTree(BTree2Node node, String prefix, boolean isLeft) {
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

    public ArrayList<Integer> search(String key) {
        return this.search(key, root);
    }

    private ArrayList<Integer> search(String key, BTree2Node temp) {
        if (temp == null) {
            return null;
        }
        int i = temp.keys.size() - 1;

        if (temp.children.isEmpty()) {
            while (i >= 0 && key.compareTo(temp.keys.get(i).getId()) != 0) {
                i--;
            }
            if (i == -1) {
                return null;
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

    public void searchAnDelete(String key) {
        this.searchAnDelete(key, root);
    }

    private void searchAnDelete(String key, BTree2Node temp) {
        if (temp == null) {
            return;
        }
        int i = temp.keys.size() - 1;

        if (temp.children.isEmpty()) {
            while (i >= 0 && key.compareTo(temp.keys.get(i).getId()) != 0) {
                i--;
            }
            if (i == -1) {
                return;
            }
            temp.keys.get(i).deleteRnn();
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
                searchAnDelete(key, temp.children.get(i));
                return;
            }
            temp.keys.get(i).deleteRnn();
        }
    }
}
