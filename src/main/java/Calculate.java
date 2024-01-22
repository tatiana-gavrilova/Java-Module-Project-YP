
import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculate {
    double sum;
    String pattern = "^-?[0-9]*[.,]?[0-9]{0,2}$"; //Регулярное выражение для проверки числа с разделитем, принимает -, целое число и до двух знаков после запятой
String menu = "Добавленные товары:\n";
    double calcPosition() {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        Formatter formatter=new Formatter();
        while (true) {
            System.out.println("Введите название нового товара");
            product.name = scanner.nextLine();
            menu = menu + product.name + "\n";
            boolean rightPrice = false;
            while (!rightPrice) {
                System.out.println("Введите цену товара в формате рубли.копейки");
                //Ввод цены
                String priceText = scanner.nextLine();
                //Сверяем с регулярным выражением
                rightPrice = Pattern.matches(pattern, priceText);
                if (!rightPrice) {
                    System.out.println("Введено не число или не верный формат!");
                }
                else{
                    //Меняем запятые на точки
                    priceText=priceText.replace(",",".");
                    //Если нет разделителя ставим его
                    if (priceText.indexOf('.')==-1) {
                        priceText = priceText + ".00";
                    }
                    //Если 1 знак после запятой, добавляем 0
                    if (priceText.length()-priceText.indexOf('.')==2) {
                        priceText=priceText+"0";
                    }
                    //Конвертируем в дабл
                    product.price = Double.parseDouble((priceText.replace(".","")))/100.0;

                    if (product.price<0) {
                        System.out.println("Цена не может быть отрицательной");
                        rightPrice = false;
                    }
                }
            }
            sum = sum + product.price;

            System.out.println("Товар:"+product.name+"("+formatter.number2format(product.price)+") добавлен");
            System.out.println("Хотите ли Вы добавить еще товар?");
            System.out.println("Чтобы завершить добавление товаров напишите Завершить");

            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Завершить")) {
                scanner.close();
                return sum;
            }
        }
    }
}




