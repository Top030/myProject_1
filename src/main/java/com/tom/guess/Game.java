package com.tom.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= 0;
        Random random= new Random();
        int secret= random.nextInt(10)+1;
        System.out.println(secret);
        while(number!= secret) {
            System.out.print("Please enter a number: ");
            number= sc.nextInt();
            System.out.println(number);
            if(number< secret){
                System.out.println("higher");
            }else if(number> secret){
                System.out.println("lower");
            }else{
                System.out.println("Great, the number is "+ number);
            }
        }


//        int i= 0;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i< 3);

    }
}
