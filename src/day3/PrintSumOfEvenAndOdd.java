package Day3;

import java.util.Scanner;

public class PrintSumOfEvenAndOdd {
    public static void check(int limitOfSeries){
        int SumOfEvenDigit=0;
        int SumOfOddDigit=0;
        for(int start=1;start<=limitOfSeries;start++){
            if(start%2==0){
                SumOfEvenDigit+=start;
            }else{
                SumOfOddDigit+=start;
            }
        }
        System.out.println("Sum of Even digits is: "+SumOfEvenDigit);
        System.out.println("Sum of Odd digits : "+ SumOfOddDigit);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int limitOfSeries=sc.nextInt();
        PrintSumOfEvenAndOdd.check(limitOfSeries);
        sc.close();
    }
}
