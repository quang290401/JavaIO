/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author forre
 */
public class JavaIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String f ="C://Users//forre//Documents//NetBeansProjects//JavaIO//file_quang.txt";
        System.out.println("bắt đầu ghi file");
        ghifile(f);
        System.out.println("kết thúc ghi file");
        System.out.println("bắt đầu đọc file");
        docfile(f);
    }

    public static void ghifile(String file) {
      
        File fio = new File(file);
        if (fio.exists() == false) {
            System.out.println("file không tồn tại");
            return;
        }
        try {
            FileOutputStream fli = new FileOutputStream(file);
            String s = "le minh quang";
            byte[] b = s.getBytes();
            try {
                fli.write(b);
                fli.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    } 
    public static void docfile( String file) {
       
      File fio = new File(file);
        if (fio.exists() == false) {
            System.out.println("file không tồn tại");
            return;
        }
        
         try {
            FileInputStream file2 = new FileInputStream(fio);
            while(true){
                int i;
          try {
              i = file2.read();
              if(i==-1){
                    break;
                }
                 System.out.println((char)i);
          } catch (IOException ex) {
              ex.printStackTrace();
          }
                
            }
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
        }
       
           
           
    }

}
