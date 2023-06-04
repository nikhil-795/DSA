import java.util.Scanner;

public class SumOfNDigit {

    public void check(int input){
     int sum=0;
     for(int start=input;start>=0;start--){
        sum+=start;
     }
     System.out.println("Sum is :" +sum);
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int input=sc.nextInt();
        SumOfNDigit c=new SumOfNDigit();
        c.check(input);
        sc.close();
    }
    
}
