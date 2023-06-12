package Day2;

import java.util.Scanner;

public class PrintuptoNumber {
    public void check(int inputInteger){
        for(int low=1;low<=inputInteger;low++){
            if(low==1 || low==0)continue;
        int flag=1;
        for(int start=2;start*start<=low;++start){
            
           if(low%start==0){
            flag=0;
            break;
           }
           }
           if(flag==1){
            System.out.println(low+" is prime ");
           }
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
