/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package standard.file.manager;
import java.io.*;
/**
 *
 * @author ADMIN
 */
public class BTreeSerialization {

    public void saveBTreeToFile(BTree bTree, String filename) {
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(bTree);
            System.out.println("Árbol B guardado en " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public BTree loadBTreeFromFile(String filename) {
        BTree bTree = null;
        try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            bTree = (BTree) ois.readObject();
            System.out.println("Árbol B cargado desde " + filename);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bTree;
    }
}
