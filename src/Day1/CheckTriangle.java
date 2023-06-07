package Day1;
import java.util.Scanner;

public class CheckTriangle {
    public void check(int inputSide1,int inputSide2,int inputSide3){
        if(inputSide1+inputSide2>inputSide3 || inputSide1+inputSide3>inputSide2 
           ||inputSide3+inputSide2>inputSide1){
           System.out.println("it is triangle");
        }else{
            System.out.println("its not triangle");
        }
    }

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Sides of triangle to check : ");
        int inputSide1=sc.nextInt();
        int inputSide2=sc.nextInt();
        int inputSide3=sc.nextInt();
        CheckTriangle c=new CheckTriangle();
        c.check(inputSide1,inputSide2,inputSide3);
        sc.close();
    }
}
