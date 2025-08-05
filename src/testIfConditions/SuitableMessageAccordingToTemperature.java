package testIfConditions;

import java.util.Scanner;

public class SuitableMessageAccordingToTemperature {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double temp = scr.nextDouble();
        if(temp<0)
            System.out.println("Freezing weather");
        if((temp>0)&&(temp<=10))
            System.out.println("Very Cold weather");
        if((temp>10)&&(temp<=20))
            System.out.println("Cold weather");
        if((temp>20)&&(temp<=30))
            System.out.println("Normal weather");
        if((temp>30)&&(temp<=40))
            System.out.println("Hot weather");
        if(temp>=40)
            System.out.println("Very Hot weather");

    }
}
