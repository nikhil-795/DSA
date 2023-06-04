import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintEvenAndOdd {

    public void check(int input){
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        for(int start=0;start<=input;start++){
            if(start%2==0){
                even.add(start);
            }else{
                odd.add(start);
            }
        }
        System.out.println("Even number are :  ");
        for(Integer Even :even ){
            System.out.println(Even+" ");
        }
        System.out.println("Odd number are : ");
        for(Integer Odd :odd ){
            System.out.println(Odd+" ");
        }
    }

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number till you want to print : ");
        int input=sc.nextInt();
        PrintEvenAndOdd c=new PrintEvenAndOdd();
        c.check(input);
        sc.close();
    }
}
