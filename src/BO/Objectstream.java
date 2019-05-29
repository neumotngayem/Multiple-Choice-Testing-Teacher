package BO;

import RS.Resources;
import UI.Main;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class Objectstream {

    public void writeDatfile(Topic topic, String fname) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(fname);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(topic);
        fos.close();
        oos.close();
    }

    public Topic readDatfile(String fname) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fname);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Topic result = null;
        while (true) {
            try {
                result = (Topic) ois.readObject();
            } catch (EOFException ex1) {
                break;
            }
        }
        fis.close();
        ois.close();
        return result;

    }

    public Key readKey(String fname) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fname);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Key k = (Key) ois.readObject();
        fis.close();
        ois.close();
        return k;

    }
}
