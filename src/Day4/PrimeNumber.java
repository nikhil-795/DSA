package Day4;

import java.util.Scanner;

public class PrimeNumber {
    public static void check(int input){
         boolean[] isprime=new boolean[input+1];
         
         // loop for making each number as prime
        for(int start=0;start<=input;start++){
            isprime[start]=true;
        }
        // check for squt(input) and then eliminate multiple 
        for(int start=2;start*start<=input;start++){
            for(int check=start*2;check<=input;check+=start){
                isprime[check]=false;
            }
        }

        // print prime number 
        for(int start=2;start<=input;start++){
            if(isprime[start]==true){
                System.out.println(start);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number upto you want to print Prime Number ");
        int input=sc.nextInt();
        PrimeNumber.check(input);
        sc.close();
    }
    
}
