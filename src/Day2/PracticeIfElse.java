package Day2;

import java.util.Scanner;

public class PracticeIfElse {

    public void check(int input){
        if(input==9){
            System.out.println("Niney");
        }
        
        if(input>0){
            System.out.println("positive number");
        }
        else{
            System.out.println("Negative");
        }
        int a=2;
        int b=a+1;
        if((a=3)==b){
            System.out.println(a);
        }else{
            System.out.println(a+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Integer: For Now take 9 ");
        int input=sc.nextInt();
        PracticeIfElse c=new PracticeIfElse();
        c.check(input);
        sc.close();
    }
    
}
