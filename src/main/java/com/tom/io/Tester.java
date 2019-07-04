package com.tom.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Tester {
    public static void main(String[] args) {
        File file= new File("data1.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        try {
            FileInputStream is = new FileInputStream(file);
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("message");
        }
        System.out.println("file opened success");
    }
}
