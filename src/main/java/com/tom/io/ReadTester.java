package com.tom.io;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) {
//        inputstream();
//        filereader();
        try {
            BufferedReader br= new BufferedReader(new FileReader("data.txt"));
            String line= br.readLine();
            while(line!= null){
                System.out.println(line);
                line= br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void filereader() {
        File file= new File("data.txt");
        try {
            FileReader fr= new FileReader(file);
            int n= fr.read();
            while(n!= -1){
                System.out.print((char)n);
                n= fr.read();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputstream() {
        File file= new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        try {
            FileInputStream fis= new FileInputStream(file);
            int n= fis.read();
            while(n!= -1){
                System.out.print((char)n);
                n= fis.read();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("file opened success");
    }
}
