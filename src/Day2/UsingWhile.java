package Day2;

import java.util.Scanner;

public class UsingWhile {
public void check(int input){
    while(input<10){
        System.out.println(input);
        input++;
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Integer: ");
        int input=sc.nextInt();
        UsingWhile c=new UsingWhile();
        c.check(input);
        sc.close();
    }
    
}
