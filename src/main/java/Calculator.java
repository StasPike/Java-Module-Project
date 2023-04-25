import java.util.Scanner;


public class Calculator {

        /*public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                Product product = new Product();
                double sum = 0;
                String productList = ":";
        }*/
        double summa = 0;
        String productList = ":\n";

        //Функция подсчета общей суммы
        public void addProduct(String productName, double productPrice) {
                productList = productList + productName + "\n";
                summa = summa + productPrice;
                System.out.println("Summa vseh tovarov: " + summa);

        }

        public void cart(int count) {
                System.out.println("Spisok vseh tovarov" + productList);
                if (summa%2 == 0) {
                        System.out.println("Itogo na " + count + " druzei vihodit po " + summa/count + " rublya");
                } else {
                        System.out.println("Itogo na " + count + " druzei vihodit " + summa/count + " rubl");
                }
        }
}