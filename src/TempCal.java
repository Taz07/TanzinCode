import java.util.Scanner;

public class Character {
    public static void main(String[] args) {

    }
        public int getTemperatureCelsius(){

            return 0;
        }

        public int getTemperatureFahrenheit(){

            return 0;
        }
        public void run () {


            double f;
            double c;
            int choice;
            double celsiusToFahrenheit;
            double fahrenheitToCelsius;

            Scanner keyboard = new Scanner(System.in);

            //do {
                System.out.println("1. Convert celsius to farenheit");
                System.out.println("2. convert farenheit to celsius");

                choice = keyboard.nextInt();

                if (choice == 1) {
                    c = getTemperatureCelsius();
                    celsiusToFahrenheit = (c * 9 / 5) + 32;
                    System.out.println("c + converting to farenheit is equal to " + celsiusToFahrenheit + "F");
                } else if (choice == 2) {
                    f = getTemperatureFahrenheit();
                    fahrenheitToCelsius = (f - 31) * 5 / 9;
                    System.out.println("f + converting to celsius is equal to " + fahrenheitToCelsius + "C");
                } else {
                    System.out.println("Invalid number, try again");
                }
            }
        }


