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
        } catch (IOException e) {
            System.out.println("Sucedio un error no se pudo guardar el arbol: "+ e.getMessage());
        }
    }

    public BTree loadBTreeFromFile(String filename) {
        BTree bTree = null;
        try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            bTree = (BTree) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("No existe el archivo o sucedio un error: "+ e.getMessage());
        }
        return bTree;
    }
}
