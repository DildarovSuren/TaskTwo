import java.util.Scanner;
public class TaskTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите номер программы (1 - калькулятор, 2 - массив): ");
        int app = in.nextInt();
        if (app == 1) {
            calc();
        } else if (app == 2) {
            massive();
        } else {
            System.out.println("Ошибка. Введите корректный номер программы!");
        }

    }

    public static void calc() { //Описание логики  калькулятора
        Scanner in = new Scanner(System.in);
        System.out.println("Программа Калькулятор запущена");
        System.out.println("Введите первое число: ");
        double first = in.nextDouble();
        System.out.println("Введите действие: ");
        String action = in.next();
        System.out.println("Введите второе число: ");
        double second = in.nextInt();

        switch (action) {
            case "/":
                calcSlash(first, second);
                break;
            case "*":
                calcX(first, second);
                break;
            case "+":
                calcSum(first, second);
                break;
            case "-":
                calcDel(first, second);
                break;
            default:
                System.out.println("Введена некорректная арифметическая операция! Начните заново!");
                break;
        }
    }

    public static void calcSum(double first, double second) { // Сложение
        System.out.printf("%.4f", (first + second));
    }

    public static void calcDel(double first, double second) { // Вычитание
        System.out.printf("%.4f", (first - second));
    }

    public static void calcX(double first, double second) { // Умножение
        System.out.printf("%.4f", (first * second));
    }

    public static void calcSlash(double first, double second) { // Деление
        if (second == 0) {
            System.out.println("Ошибка. На ноль делить нельзя");
        } else {
            System.out.printf("%.4f", (first / second));
        }
    }

    public static void massive() { //Описание логики массивов
        Scanner in = new Scanner(System.in);
        System.out.println("Программа Массивы запущена");
        System.out.println("Введите длину массива");
        String[] wordsArr = new String[in.nextInt()];
        System.out.println("Длина массива равна " + wordsArr.length);
        System.out.println("Введите " + wordsArr.length + " слов через Enter");
        String top = "";
        for (int j = 0; j < wordsArr.length; j++) {
            wordsArr[j] = in.next();
        }
        for (int k = 0; k < wordsArr.length; k++) {
            if (wordsArr[k].length() >= top.length()) {
                top = wordsArr[k];
            }
        }
        System.out.println("Самое длинное слово в массиве: " + top);

    }
}

