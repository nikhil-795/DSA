package Day1;
import java.util.Scanner;

public class CheckPrime {

     public void check(int input){
        //using flag to check true or false
        boolean flag=true;

        //running loop from input=2 to squart root of input 
        for(int start=2;start*start<=input;start++){

            if(input%start==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(input+" is prime");
        }else{
            System.out.println(input+" is not prime");
        }
     }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter : ");
        int input=sc.nextInt();
        CheckPrime c=new CheckPrime();
        c.check(input);
        sc.close();
    }
    
}
