import java.util.Scanner;

public class TempCalConv {

    public static void main(String[] args) {
        calcTemp();
    }

    public static void calcTemp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter F to convert Fahrenheit to Celsius.");
        System.out.println("                      -Or-           ");
        System.out.println("Please enter C to convert Celsius to Fahrenheit.");
        String option = input.next();

        if (option.toLowerCase().equals("f")){
            System.out.println("Please enter a temperature in degrees Fahrenheit.");
            ftoc();
        }else if (option.toLowerCase().equals("c")){
            System.out.println("Please enter a temperature in degrees Celsius.");
            ctof();
        }else{
            System.out.println("ERROR PLEASE ENTER A F OR A C TO PROCEED!");
        }
    }

    public static void ftoc() {
        Scanner input = new Scanner(System.in);
        int celsius = input.nextInt();
        System.out.println(celsius + " celsius is equivalent to " + ((celsius * 9 / 5.0) + 32) + " Fahrenheite");
    }

    public static void ctof() {
        Scanner input = new Scanner(System.in);
        int Fahrenheit = input.nextInt();
        System.out.println(Fahrenheit + " Fahrenheit is equivalent to " + ((Fahrenheit - 32) * (5 / 9.0)) + " Celsius");
    }


}

