package chapter2;

import java.util.Scanner;

public class Chapter2 {

    public static void main(String[] args) {
        System.out.println("Happy Tuesday!");
        // if you use print instead of println, add your own new lines with \n
        System.out.print("This is just a print statement\n");
        System.out.print("Here's another print!\n");
        // to get a " in the output, use \"
        System.out.println("Programming is \"fun\"");
        System.out.println("");
        System.out.println("Welcome to our Java Shop");
        System.out.println("1. Large Coffee\t\t\t$1.00");
        System.out.println("\tAdd Flavor Shot:\t$0.50");
        System.out.println("2. Espresso Shot\t\t$0.50");
        System.out.println("3. Latte\t\t\t$4.50");
        
        System.out.println("");
        // store the menu as a string literal for use later
        String thisIsMyFancyMenu = "Welcome to our Java Shop\n"
                    + "1. Large Coffee\t\t\t$1.00\n"
                    + "\tAdd Flavor Shot:\t$0.50\n"
                    + "2. Espresso Shot\t\t$0.50\n"
                    + "3. Latte\t\t\t$4.50";
        
        System.out.println(thisIsMyFancyMenu);
        
        int numberOfItems = 0;
        
        numberOfItems = numberOfItems + 1;
        
        numberOfItems = numberOfItems + 1;
        
        numberOfItems = numberOfItems + 1;
        
        System.out.println("Number of items ordered: " + numberOfItems);
        
        
        // order of operations will add 7 to the string, then 7 again to the string
        // 7 + 7 = 77
        System.out.println("7 + 7 = " + 7 + 7);
        
        // use order of operations to avoid string concatenation
        System.out.println("7 + 7 = " + (7 + 7));
        
        // or, use a variable!
        int sumOf7and7 = 7 + 7;
        System.out.println("7 + 7 = " + sumOf7and7);
        
        double someDouble = 5.0;
        
        // Eric will almost never use these because he doesn't want to type f after a number
        float someFloat = 5.0f;
        
        double aproximateSpeedOfLightInMetersPerSecond = 3E8;
        
        System.out.println("The speed of light is aproximately: " + aproximateSpeedOfLightInMetersPerSecond + "m/s");
        
        // boolean is either true or false
        boolean isRaining = false;
        
        // single characters come with single quotes
        char someCharacter = 'E';
        
        int myFavoriteNumber;
        // make sure you initialize ( or give it the first value, before you use it )
        myFavoriteNumber = 42;
        System.out.println(myFavoriteNumber);
        
        String name;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please type in your name:");
        name = keyboard.nextLine();
        
        System.out.println("Hello " + name + ", nice to meet you!");
    }
    
}
