import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
        /*Часть 1 Входные параметры для счётчика
         Если введено количество человек = 1, то ОШИБКА и повторить ввод
        Если введено меньше 1, то ОШИБКА и повторить ввод пока не будет введено > 1
        После введения > 1 - создать калькулятор который считает счет на это количество людей
         */
        Scanner scanner = new Scanner(System.in);
        int friendCount;
        while (true) {
            System.out.print("Enter the number of people (more than one): ");
            friendCount = scanner.nextInt();
            if (friendCount > 1) {
                System.out.println("Number of people: " + friendCount);
                break;
            } else {
                System.out.println("You entered the wrong number, please try again.");
            }
        }

        //Часть 2 - Калькулятор, в отдельном классе
        Calculator calculator = new Calculator();
        Product product = new Product();

        while (true) {
            System.out.print("Hotite dobavit ese tovar? : ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("finish")) {
                System.out.print("Enter product name : ");
                product.name = scanner.next();
                System.out.print("Enter product price : ");
                product.price = scanner.nextDouble();
                System.out.println("Tovar: " + product.name + " uspeshno dobavlen v calculator. Ego cena: " + product.price);
                calculator.addProduct(product.name, product.price);

            } else {
                System.out.println("Vvod dannih zavershen");
                break;
            }
        }

        //Часть 3 - Вывод результатов
        calculator.cart(friendCount);

        System.out.println("THE END");
    }
}
