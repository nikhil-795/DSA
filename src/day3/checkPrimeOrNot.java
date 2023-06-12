package day3;

import java.util.Scanner;

public class checkPrimeOrNot {

   public static void check(int InputNumber){
    for(int start=1;start*start<InputNumber;start++){
        if(InputNumber==1|| InputNumber==2){
          System.out.println();
        }
        if(start%2==0){
            System.out.println(start+" is not prime");
        }
    }
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number till you want to print : ");
        int InputNumber=sc.nextInt();
        checkPrimeOrNot.check(InputNumber);
        sc.close();
    }
    
}
