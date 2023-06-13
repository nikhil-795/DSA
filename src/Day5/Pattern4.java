package Day5;

import java.util.Scanner;

public class Pattern4 {
    public static void print(int row, int column){
        
        for(int i=1;i<=row;i++){
           
            for(int j=1;j<=column;j++){
               char ch=(char)('A'+j-1);
              System.out.print(ch+" ");
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
        Pattern4.print(row,column);
        sc.close();
    }
    
}
