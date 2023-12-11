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
public class Llave2 {
    private String nombre;
    private ArrayList<Integer> rnn = new ArrayList();

    /**
     * Construtor de la llave
     * 
     *
     * @param El nombre de la llave
     * @param el rnn o el numero de registro
     * @return Retorna true si la accion se realizo de forma correcta.
     */
    public Llave2(String nombre, int rnn) {
        this.nombre = nombre;
        this.rnn.add(rnn);
    }

    public String getId() {
        return nombre;
    }

    public void setId(String id) {
        this.nombre = id;
    }

    public ArrayList<Integer> getRnn() {
        return rnn;
    }

    public void setRnn(int rnn) {
        if(!this.rnn.contains(rnn)) this.rnn.add(rnn);
    }
    
    public void deleteRnn(){
        this.rnn.clear();
    }

    @Override
    public String toString() {
        return nombre;
    }
}
