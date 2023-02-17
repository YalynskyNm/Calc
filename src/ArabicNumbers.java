public class ArabicNumbers {
    public static void SumArabic() {

        int numb_1_Int = Integer.parseInt(All.number1);
        int numb_2_Int = Integer.parseInt(All.number2);

        try {

            if (numb_1_Int < 1 || numb_1_Int > 10 || numb_2_Int > 10 || numb_2_Int < 1) {

                throw new Exception("Несоответствие ТЗ. Программа будет завершена (обработано через throw new)");

            }

        } catch (Exception ex_2) {

            System.out.println(ex_2.getMessage());
            System.exit(1);
        }
            switch (All.operation) {

                case "+":
                    All.ResultSum = numb_1_Int + numb_2_Int;
                    break;

                case "-":

                    All.ResultSum = numb_1_Int - numb_2_Int;
                    break;

                case "*":
                    All.ResultSum = numb_1_Int * numb_2_Int;
                    break;

                case "/":
                    All.ResultSum = numb_1_Int / numb_2_Int;
                    break;
            }



            System.out.print(All.ResultSum);

        }

    }

