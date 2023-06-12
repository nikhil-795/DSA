package day3;

import java.util.Scanner;

public class checkPrimeOrNot {

   public static void check(int InputNumber){
    
     boolean[] isprime=new boolean[InputNumber+1];
     for(int start=0;start<=InputNumber;start++){
        isprime[start]=true;
     }

      for(int start=2;start*start<=InputNumber;start++){
        for(int check=2*start;check<=InputNumber;check+=start){
            isprime[check]=false;
        }
    }

    for(int start=2;start<=InputNumber;start++){
        if(isprime[start]==true){
        System.out.println(start);
        }
     }

   
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number till you want to print : ");
        int InputNumber=sc.nextInt();
        checkPrimeOrNot.check(InputNumber);
        sc.close();
    }
    
}
