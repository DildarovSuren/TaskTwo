import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class TaskTwo {
    public static void main(String[] args) {
        /**
         * Реализуем программу-калькулятор с простыми арифметичекими операциями
         */
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.####"); //Используем данный метод для форматирования ответа в консоли
        System.out.println("Введите номер программы 1 - Калькулятор, 2 - Массивы");
        int digit = in.nextInt();

        if (digit == 1) {
            System.out.println("Программа Калькулятор запущена");
            System.out.println("Введите первое число:");
            float a = in.nextFloat();
            System.out.println("Введите второе число:");
            float b = in.nextFloat();
            System.out.println("Введите арифметическую операцию и нажмите ENTER:");
            String c = in.next();

            if(b == 0) {     //Объявляем условие, чтобы взять во внимание случай с делением на 0
                switch (c) {
                    case "/": System.out.println("Ошибка.На ноль делить нельзя");
                        break;
                    case "*": System.out.println(df.format(a * b));
                        break;
                    case "+": System.out.println(df.format(a + b));
                        break;
                    case "-": System.out.println(df.format(a - b));
                        break;
                    default: System.out.println("Введена некорректная арифметическая операция! Начните заново!");
                        break;
                }
            } else {
                switch (c) {
                    case "/": System.out.printf("%.4f", (a / b));
                        break;
                    case "*": System.out.printf("%.4f", (a * b));
                        break;
                    case "+": System.out.printf("%.4f", (a + b));
                        break;
                    case "-": System.out.printf("%.4f", (a - b));
                        break;
                    default: System.out.println("Введена некорректная арифметическая операция! Начните заново!");
                        break;
                } }

        } else if (digit == 2) { //Программа Масивы
            System.out.println("Программа Массивы запущена");
            System.out.println("Введите длину массива");
            String[] wordsArr = new String [in.nextInt()];
            System.out.println("Длина массива равна " + wordsArr.length);
            System.out.println("Введите " + wordsArr.length + " слов через Enter");
            String top = "";
            for (int j = 0; j < wordsArr.length; j++) {
                wordsArr[j] = in.next();
            }
            for (int k = 0; k < wordsArr.length; k++) {
                if(wordsArr[k].length() >= top.length()){
                    top = wordsArr[k];
                }
            }
            System.out.println("Самое длинное слово в массиве: " + top);

        } else {
            System.out.println("Введен некорректный номер программы");
        }
    }
}
