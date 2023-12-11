/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package standard.file.manager;
import java.util.ArrayList;
import java.io.Serializable;
/**
 *
 * @author ADMIN
 */
public class BTreeNode implements Serializable{
    ArrayList<Llave> keys;
    ArrayList<BTreeNode> children;
    BTreeNode parent;

    public BTreeNode() {
        this.keys = new ArrayList<>();
        this.children = new ArrayList<>();
        this.parent = null;
    }
}
