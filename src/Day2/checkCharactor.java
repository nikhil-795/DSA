package Day2;

import java.util.Scanner;

public class checkCharactor {
    
    public void check(char input){
        if(input>='a' &input<='z'){
          System.out.println("lower  case");
        }else if(input>='A'& input<='Z'){
            System.out.println("upper case");
        }else if(input>='0' &input<='9'){
            System.out.println("numeric digit");
        }
        }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  ");
        char input=sc.next().charAt(0);
        checkCharactor c=new checkCharactor();
        c.check(input);
        sc.close();
    }
    
}
