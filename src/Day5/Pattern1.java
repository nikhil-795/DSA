package Day5;

import java.util.Scanner;

public class Pattern1 {
    public static void print(int row, int column){
        for(int i=1;i<=row;i++){
            int value=i;
            for(int j=1;j<=i;j++){
               System.out.print(value+" ");
               value++;
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
        Pattern1.print(row,column);
        sc.close();
    }
    
}
