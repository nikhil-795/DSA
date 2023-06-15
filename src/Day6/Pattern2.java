package Day6;

import java.util.Scanner;

public class Pattern2 {
    public static void print(int row, int column){
        
        for(int i=1;i<=row;i++){
            
            int ch_int='A'+i-1;
            char ch=(char)ch_int;
            for(int j=1;j<=i;j++){             
                System.out.print(ch+" ");
               
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
        Pattern2.print(row,column);
        sc.close();
    }

    
}
