package Day5;

import java.util.Scanner;

public class Pattern5 {
    public static void print(int row, int column){
        char c='A';
        for(int i=1;i<=row;i++){
            
            for(int j=1;j<=column;j++){
               System.out.print(c+++" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows : ");
        int row=sc.nextInt();
        System.out.print("Enter Columns : ");
        int column=sc.nextInt();
        Pattern5.print(row,column);
        sc.close();
    }
    
}
