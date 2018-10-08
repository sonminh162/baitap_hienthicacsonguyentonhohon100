package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int number;
        int i;
        System.out.println("Prime (<100):");
        for(number = 2;number <= 100;number++){
            boolean check = true;
            for(i=2;i<=Math.sqrt(number);i++){
                if((number%i)==0) check = false;
            }
            if(check) System.out.print("\t"+number);

        }

    }
}
