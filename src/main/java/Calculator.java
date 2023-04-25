import java.text.MessageFormat;

public class Calculator {

        double summa = 0;
        String productList = ":\n";

        //Функция подсчета промежуточной суммы
        public void addProduct(String productName, double productPrice) {
                //Сосотавляем список товаров, но вывод в другом методе
                productList = productList + productName + "\n";
                //Промежуточная сумма
                summa = summa + productPrice;
                System.out.println("Promujutochnaya stoimost tovarov: " + summa);
        }

        //Функия выввода списка товаров и итого на каждого друга
        public void cart(int count) {
                System.out.println("Spisok vseh tovarov" + productList);
                System.out.println(MessageFormat.format("Itogo na {0} druzei vihodit {1, number, currency} v srednem na kajdogo", count, summa/count));
                /*if (summa%2 == 0) {
                        System.out.println("Itogo na " + count + " druzei vihodit po " + summa/count + " rublya");
                } else {
                        System.out.println("Itogo na " + count + " druzei vihodit " + summa/count + " rubl");
                }*/
        }
}