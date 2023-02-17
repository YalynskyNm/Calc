import java.util.Arrays;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Лень тебе телефон открыть?");
        All.number1 = scanner.next();
        All.operation = scanner.next();
        All.number2 = scanner.next();

        CheckOperation(); // проверяем оператора на дееспособность

        if (All.CheckOnArabik) {        // проверка на символы
            ArabicNumbers.SumArabic();
        } else {
            RomanNumbers.SumRoman();
        }
    }

    public static void Search_In_Arabic() { // гоняем по листам смотрим что ввёл это дрищ


        All.ResultSearchNumb_1 = Arrays.asList(All.Arabic).contains(All.number1);
        All.ResultSearchNumb_2 = Arrays.asList(All.Roman).contains(All.number1);

        All.ResultSearchNumb_3 = Arrays.asList(All.Arabic).contains(All.number2);
        All.ResultSearchNumb_4 = Arrays.asList(All.Roman).contains(All.number2);

        try {

            if (All.ResultSearchNumb_1 != All.ResultSearchNumb_3 || All.ResultSearchNumb_2 != All.ResultSearchNumb_4) { // если в операции участвую римские и арабские то пошёл он
                throw new Exception("Несоответствие ТЗ. Программа будет завершена (обработано через throw new)");
            } else {
                All.CheckOnArabik = Arrays.asList(All.Arabic).contains(All.number1);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }

    public static void CheckOperation() {
        try {
            switch (All.operation) {
                case "+", "-", "*", "/" -> Search_In_Arabic();
                default ->
                        throw new Exception("Несоответствие ТЗ. Программа будет завершена (обработано через throw new)");
            }
        } catch (Exception ex_1) {
            System.out.println(ex_1.getMessage());
            System.exit(1);
        }
    }
}
