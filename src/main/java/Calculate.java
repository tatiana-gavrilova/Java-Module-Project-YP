
import java.util.Scanner;

public class Calculate {
    double sum;
String menu = "Добавленные товары:\n";
    double calc() {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        while (true) {
            System.out.println("Введите название нового товара");
            product.name = scanner.next();
            menu = menu + product.name + "\n";
            boolean rightPrice = false;
            while (!rightPrice) {
                System.out.println("Введите цену товара в формате рубли.копейки");

                if (scanner.hasNextDouble()) {
                    product.price = scanner.nextDouble();
                    if (product.price < 0) {
                        System.out.println("Цена не может быть отрицательной");
                    } else {
                        rightPrice = true;
                    }
                } else {
                    System.out.println("Введено не число!");
                    scanner.nextDouble();
                }
            }
                sum = sum + product.price;

                    System.out.println("Товар добавлен");
                    System.out.println("Хотите ли Вы добавить еще товар?");
                    System.out.println("Чтобы завершить добавление товаров напишите Завершить");

                    String answer = scanner.next();
                     if (answer.equalsIgnoreCase("Завершить")) {
                         scanner.close();
                         return sum;
                     }
                }
            }
        }




