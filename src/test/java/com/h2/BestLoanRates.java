package com.h2;
import java.util.*;

public class BestLoanRates {

    public static void main(String args[]){

        public static final Map<Integer,Float> bestRates = Map.of(1, 5.50f, 2, 3.45f, 3, 2.67f);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String name= scanner.nextLine();
        System.out.println("hello "+ name);
        System.out.println("enter loan term in years");
        int loanTermInYears = scanner.nextInt();
       float bestRate=getRates(loanTermInYears);

       if(bestRate==0.0f){
           System.out.println("No available rates for term: " + loanTermInYears + " years");

       }
       else{
           System.out.println("Best Available Rate: " + getRates(loanTermInYears) + "%");
       }




    }

    public static float getRates(int loanTermInYears){

        return 0.0f;

    }
}
