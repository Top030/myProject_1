package com.tom.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        try {
//            URL url= new URL("https://api.myjson.com/bins/t555j");
            URL url= new URL("https://api.myjson.com/bins/t555j");
            HttpURLConnection connection= (HttpURLConnection) url.openConnection();
            InputStream is= connection.getInputStream();
            BufferedReader br= new BufferedReader(new InputStreamReader(is));
            String line= br.readLine();
            StringBuffer json= new StringBuffer();
            while(line!= null){
//                System.out.println(line);
                json.append(line);
                line= br.readLine();
            }
            System.out.println(json.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
