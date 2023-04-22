import java.util.Scanner;


public class Calculator {

public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
                System.out.print("Enter product name : ");
                String productName = scanner.next();

                if (!productName.equalsIgnoreCase("finish")) {
                        System.out.println("Calculator remember product: " + productName);
                        //Часть 2 - Калькулятор, в отдельном классе
                        break;
                } else {
                        System.out.println("Program is over");
                }
        }

        /*System.out.print("Enter product price : ");
        float productPrice = scanner.nextFloat(); */

        //Часть 2

        System.out.println("Hello!");
        }
}