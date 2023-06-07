package Day1;
import java.util.Scanner;

public class EvenOrOdd {
    
    public void check(int inputNumber){
    
      if(inputNumber%2==0){
        System.out.println("Even"+inputNumber);
      }else{
        System.out.println("odd"+inputNumber);
      }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to check : ");
        int inputNumber=sc.nextInt();
        EvenOrOdd e=new EvenOrOdd();
        e.check(inputNumber);
        sc.close();
    }
}
