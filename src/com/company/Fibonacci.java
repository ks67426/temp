package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        int n = -1;
        try {
            System.out.println("Please give the number of Fibonacci numbers: ");
            Scanner scanner = new Scanner(System.in);
            scanner=new Scanner(System.in);
            n = scanner.nextInt();
        } catch (InputMismatchException ie) {
            System.out.println("It's not a number");
            return;
        }

        int F0 = 0;
        int F1 = 1;
        if (n==0) {
            System.out.println(0);
        }
        for(int i=0; i<=n; i++){
           if(i==0 || i==1) {
               System.out.println(i);
           }
          else {
               int fibonacci = F0 + F1;
               System.out.println(fibonacci);
               F0 = F1;
               F1 = fibonacci;
           }
        }
    }
}
