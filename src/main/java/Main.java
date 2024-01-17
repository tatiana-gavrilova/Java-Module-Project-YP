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

        double sum= calculate.calc();

        System.out.println(calculate.menu);

        double totalsum = sum/totalPeople   ;
                       System.out.println(formatter.n2f(totalsum)+" "+formatter.n2r(totalsum));
                       scanner. close();

    }

}






