package com.tom.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int secret= new Random().nextInt(10)+ 1;
        System.out.println(secret);
        int max= 4;
        for(int i=1; i<=max; i++){
            System.out.print("Please enter a number (1/"+ max+"): ");
            int number= sc.nextInt();
            System.out.println("第"+ i+"次");
            if(number> secret){
                System.out.println("lower");
            }else if(number< secret){
                System.out.println("higher");
            }else{
                System.out.println("Great, the number is "+ number);
                break;
            }
        }
        System.out.println("The End");
    }
}
