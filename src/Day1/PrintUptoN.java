package Day1;
import java.util.Scanner;

public class PrintUptoN {
    public void check(int input){
      Boolean[] isprime=new Boolean[input+1];

      for(int start=0;start<=input;start++){
        isprime[start]=true;
      }
       for(int start=2;start*start<=input;start++){
        if(isprime[start]==true){
            for(int check=start*2;check<=input;check+=start){
                isprime[check]=false;
            }
        }
       }

      for(int start=2;start<=input;start++)
      {   if(isprime[start]==true){
      System.out.println(start);
      }
      }
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
