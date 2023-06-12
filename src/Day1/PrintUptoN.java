package Day1;
import java.util.Scanner;

public class PrintUptoN {
    public void check(int input){
   
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number till you want to print ");
        int input=sc.nextInt();
        PrintUptoN c=new PrintUptoN();
        c.check(input);
        sc.close();
    }
}
