import java.util.Scanner;

public class CheckForInterger {
    public void check(int inputInteger){
    if(inputInteger>0){
        System.out.println("enter number is Positve Integer");
    }else if(inputInteger<0){
        System.out.println("ente number is Negative Integer");
    }
    else{
        System.out.println("enter number is Zero");
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Integer: ");
        int inputInteger=sc.nextInt();
        CheckForInterger c=new CheckForInterger();
        c.check(inputInteger);
    }
}
