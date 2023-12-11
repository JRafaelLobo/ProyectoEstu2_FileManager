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
public class BTree2Node {
    ArrayList<Llave2> keys;
    ArrayList<BTree2Node> children;

    public BTree2Node() {
        this.keys = new ArrayList<>();
        this.children = new ArrayList<>();
    }
}
