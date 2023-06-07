package Day2;

import java.util.Scanner;

public class GreaterNumber {
 
    public void check(int firstNumber,int secondNumber){
        if(firstNumber>secondNumber){
            System.out.println("first Number is greater");
        }
        else{
            System.out.println("Second number is greater");
        }
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter first number :");
    int firstNumber=sc.nextInt();
    System.out.print("Enter Second number :");
    int secondNumber=sc.nextInt();
    GreaterNumber g=new GreaterNumber();
    g.check(firstNumber,secondNumber);
    sc.close();
    }
    
}
