package Day2;

import java.util.Scanner;

public class PrintuptoNumber {
    public void check(int inputInteger){
        for(int start=1;start<=inputInteger;start++){
            System.out.println(start);
    
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Integer: ");
        int inputInteger=sc.nextInt();
        PrintuptoNumber c=new PrintuptoNumber();
        c.check(inputInteger);
        sc.close();
    }
    
}
