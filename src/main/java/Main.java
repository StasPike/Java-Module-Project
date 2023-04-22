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
        int number;
        while (true) {
            System.out.print("Enter the number of people (more than one): ");
            number = scanner.nextInt();

            if (number > 1) {
                System.out.println("Number of people: " + number);
                break;
            } else {
                System.out.println("You entered the wrong number, please try again.");
            }
        }


        //Часть 2 - Калькулятор, в отдельном классе

        //Часть 3 - Вывод результатов

        System.out.println("Hello, World!");
    }
}
