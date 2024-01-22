import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int totalPeople;
        Scanner scanner = new Scanner(System.in);
        Calculate calculate = new Calculate();      
        Formatter formatter=new Formatter();
        System.out.println("Добрый день! На сколько человек необходимо разделить счёт?");

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Некорректное значение для подсчёта! Ввведи еще раз\nНе число: ");
        }
        while (true) {
            int numberPeople = scanner.nextInt();
            if (numberPeople > 1) {
                System.out.println("Количество человек: " + numberPeople + "." + " Создаём калькулятор!");
                totalPeople=numberPeople;
                break;
            } else {
                System.out.println("Некорректное значение для подсчёта! Ввведи еще раз\nЧисло меньше <=1: " + numberPeople);
            }
        }

        double sum= calculate.calcPosition();
        System.out.println(calculate.menu);

        double totalsum = sum/totalPeople   ;
                       System.out.println("Общая сумма:"+ formatter.number2format(sum)+" "+formatter.number2rub(sum));
                       System.out.println("Всего людей: "+totalPeople+" На каждого: "+formatter.number2format(totalsum)+" "+formatter.number2rub(totalsum));
                       scanner. close();
    }
}






