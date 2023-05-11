/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author forre
 */
public class object_ioStrem {

    public static void main(String[] args) {
        System.out.println("bắt đầu ghi đối tượng");
        ghiobject();
        docOject();
    }

    public static void ghiobject() {
        try {
            FileOutputStream f = new FileOutputStream("C:\\quang.txt\\new2.txt");
            try {
                ObjectOutputStream file = new ObjectOutputStream(f);
                ArrayList<Integer> lis = new ArrayList<>();
                lis.add(1);
                lis.add(2);
                lis.add(3);
                file.writeObject(lis);
                file.close();
            } catch (IOException ex) {
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void docOject() {
        try {
            FileInputStream f = new FileInputStream("C:\\quang.txt\\new2.txt");
            try {
                ObjectInputStream fio = new ObjectInputStream(f);
                try {
                    ArrayList<Integer> ds = (ArrayList<Integer>) fio.readObject();
                    System.out.println(ds);
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
