package problemguessing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tennis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Great the user
        System.out.println("Welcome to The Tennis Racket Ordering System!");
        //Ask for name
        System.out.print("Please Enter your Name: ");
        String name = sc.nextLine();
        //Ask for age
        System.out.print("Please Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        //Display Racket options or brands
        System.out.println("\nAvailable Brands and their Prices");
        System.out.println("$3000: Technifibre / Babolat");
        System.out.println("$5000: Head / Yonex");
        System.out.println("$8000: Vector");
        //Ask for brand choice
        System.out.print("\nPlease enter your chosen brand: ");
        String brand = sc.nextLine().trim();
        //Brand validation and price confirmation
        boolean valid = true;
        int price = 0;
        if (brand.equals("Technifibre") || brand.equals("Babolat")) {
            price = 3000;
        }
        //System.out.println("Thank you for Choosen!"+brand+"Technifibre / Babolat");
        else if (brand.equals("Head") || brand.equals("Yonex")) {
            price = 5000;
        }
        //System.out.println("Thank you for Choosen!"+brand+"Head / Yonex");
        else if (brand.equals("Vector")) {
            price = 8000;
        }
        //System.out.println("Thank you for Choosen!"+brand+"Vector");
        else {
            //System.out.println("The brand is not available");
            valid = false;
        }
        //Final Message
        if (valid) {
            System.out.println("\nThank you for choosing " + brand + "! The price is $" + price + ".");
            System.out.println("Order Summary:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Selected Brand: " + brand);

        } else {
            System.out.println("\nSorry ,The brand you selected is not available.");
        }
        // Ask for delivery date
        System.out.print("\nPlease enter a delivery date (dd/MM/yyyy): ");
        String inputDate = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // strict parsing

        try {
            Date deliveryDate = sdf.parse(inputDate);
            Date minDate = sdf.parse("09/06/2025");

            if (!deliveryDate.before(minDate)) {
                System.out.println("\nThank you! Your order has been placed for delivery on " + sdf.format(deliveryDate) + ".");
            } else {
                System.out.println("\nError: Delivery date must be on or after 09/06/2025.");
            }
        } catch (ParseException e) {
            System.out.println("\nError: Invalid date format. Please use dd/MM/yyyy.");
        }
    }
    }
