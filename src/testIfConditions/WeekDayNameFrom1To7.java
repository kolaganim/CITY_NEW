package testIfConditions;

import java.util.Scanner;

public class WeekDayNameFrom1To7 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("week day name from (1 to 7): ");
        int dayNumber = scr.nextInt();
        if (dayNumber == 1)
            System.out.println("day: Sunday");
        if (dayNumber == 2)
            System.out.println("day: Monday");
        else if (dayNumber == 3)
            System.out.println("day; Tuesday");
        else if (dayNumber == 4)
            System.out.println("day; Wednesday");
        else if (dayNumber == 5)
            System.out.println("day; Thursday");
        else if (dayNumber == 4)
            System.out.println("day; Friday");
        else if (dayNumber == 4)
            System.out.println("day; Saturday");
        else
            System.out.println("Invalid Week day Name");
    }
}