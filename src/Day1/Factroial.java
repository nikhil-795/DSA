package Day1;
import java.util.Scanner;

public class Factroial {
    public void check(int  input){
        if(input<=0){
          System.out.println("please enter value greater than zero .");
        }
        else{
            int sum=1;
        for(int start=1;start<=input;start++){
            
            sum=sum*start;
            
        }
        System.out.println(sum+" ");
        int sum1=1;
        for(int start=input;start>=1;start--){
            
            sum1=sum1*start;
            
        }
        System.out.println(sum1+" ");
    }
     }

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Integer: ");
        int input=sc.nextInt();
        Factroial c=new Factroial();
        c.check(input);
        sc.close();
    }
}
