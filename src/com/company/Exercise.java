package com.company;

public class Exercise {
    public static void main(String[] args) {
        int n = 1000;
        int count = 0;
        boolean podzielna = false;
        for (int i = 2; i <= n; i++) {
            podzielna=false;
            for (int dzielnik = 2; dzielnik <= i; dzielnik++) {
                if (((i % dzielnik) == 0) && (i != dzielnik)){
                    podzielna = true;
                    break;
                }
            }
            if(!podzielna) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("There are "+ count);
        //write prime numbers to 100 (%-modulo)
    }
}
