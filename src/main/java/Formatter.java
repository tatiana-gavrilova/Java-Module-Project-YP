public class Formatter {
    String number2rub (double sum){
        sum=Math.floor(sum);
        String c="";
        if (sum<10){
            switch ((int) sum) {
                case (1) -> c = "рубль";
                case (2), (3), (4) -> c = "рубля";
                case (5), (6), (7), (8), (9), (0) -> c = "рублей";
            }
        } else if ((int) sum>=10&&(int)sum<20) {
            c =  "рублей";
        }

        else if ((int) sum>20){
            c = switch ((int) (sum % 10)) {
                case (1) -> "рубль";
                case (2), (3), (4) -> "рубля";
                case (5), (6), (7), (8), (9), (0) -> "рублей";
                default -> c;
            };
            }
        return c;
    }
    String number2format (double sum){
        return String.format("%,.2f", sum).replace(',', '.');
    }
}