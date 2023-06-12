package Day4;

import java.util.Scanner;

public class Pattern6 {
    public static void print(int row, int column){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
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
        Pattern6.print(row,column);
        sc.close();
    }
    
}
