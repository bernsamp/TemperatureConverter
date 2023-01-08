import java.util.Scanner;

public class Main {

        public static void main(String arg[])
        {
            double fahrenheit;
            double celsius;
            double kelvin;

            System.out.println("\n----------Welcome to the Temperature Converter---------- \n");
            System.out.println("Choose the type of conversion you want: \n\n 1. Fahrenheit to Celsius \n 2. Celsius to Fahrenheit \n 3. Kelvin to Celsius \n 4. Celsius to Kelvin \n 5. Kelvin to Fahrenheit \n 6. Fahrenheit to Kelvin\n");

            Scanner scanner = new Scanner(System.in);

            int userInput = scanner.nextInt();

            switch(userInput){

                case 1 : System.out.println("Enter Fahrenheit temperature:");
                    fahrenheit = scanner.nextDouble();
                    celsius = (fahrenheit - 32) * 5/9;
                    System.out.println("Celsius temperature is: " + celsius);
                    break;

                case 2 : System.out.println("Enter Celsius temperature:");
                    celsius = scanner.nextDouble();
                    fahrenheit = ((9 * celsius) / 5) + 32;
                    System.out.println("Fahrenheit temperature is: " + fahrenheit);
                    break;

                case 3 : System.out.println("Enter Kelvin temperature:");
                    kelvin = scanner.nextDouble();
                    celsius = kelvin - 273.15;
                    System.out.println("Celsius temperature is: " + celsius);
                    break;

                case 4 : System.out.println("Enter Celsius temperature:");
                    celsius = scanner.nextDouble();
                    kelvin = celsius + 273.15;
                    System.out.println("Kelvin temperature is: " + kelvin);
                    break;

                case 5 : System.out.println("Enter Kelvin temperature:");
                    kelvin = scanner.nextDouble();
                    fahrenheit = ((kelvin - 273.15) * 9/5) + 32;
                    System.out.println("Fahrenheit temperature is: " + fahrenheit);
                    break;

                case 6 : System.out.println("Enter Fahrenheit temperature:");
                    fahrenheit = scanner.nextDouble();
                    kelvin = ((fahrenheit - 32) * 5/9) + 273.15;
                    System.out.println("Kelvin temperature is: " + kelvin);
                    break;

                default:  System.out.println("Please choose a valid option");
            }
        }
    }