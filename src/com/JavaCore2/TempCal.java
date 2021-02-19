

public class TempCal {
    public static void main(String[] args) {

        double f;
        double c;
        int choice = 2;
        double celsiusToFahrenheit;
        double fahrenheitToCelsius;
        double temp = 100;



        if (choice == 1) {
            celsiusToFahrenheit = (temp * 9 / 5) + 32;
            System.out.println("c + converting to farenheit is equal to " + celsiusToFahrenheit + "F");
        } else if (choice == 2) {
            fahrenheitToCelsius = (temp - 31) * 5 / 9;
            System.out.println("f + converting to celsius is equal to " + fahrenheitToCelsius + "C");
        } else {
            System.out.println("Invalid number, try again");
        }
    }
    }




