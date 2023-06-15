package Day3;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void check(int InputLimit){
        for(int start=1;start<=InputLimit;start++){
           
        double TemperatureInCelsius=(start - 32)/1.8;
      
        System.out.println("Fahrenheit = "+start+ " Celsius ="+TemperatureInCelsius);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperaturw Till you want to print :");
        int InputLimit=sc.nextInt();
        FahrenheitToCelsius.check(InputLimit);
        sc.close();
    }
    
}
