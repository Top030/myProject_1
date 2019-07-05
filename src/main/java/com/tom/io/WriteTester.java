package com.tom.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
        File jkDir= new File("Z:\\Kotlin\\jk");
        jkDir.mkdir();
        FileWriter fw= new FileWriter("Z:\\Kotlin\\jk\\output.txt");
        fw.write("abc");
        fw.flush();
        fw.close();
    }

}
