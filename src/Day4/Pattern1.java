package Day4;

import java.util.Scanner;

public class Pattern1 {

     public static void print(int row,int column){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total row : ");
        int row=sc.nextInt();
        System.out.print("Enter total column : ");
        int column=sc.nextInt();
        Pattern1.print(row,column);
        sc.close();
    }
    
}
