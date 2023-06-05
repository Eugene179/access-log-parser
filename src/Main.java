import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число и нажмите <Enter> ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите следующее число и нажмите <Enter> ");
        int number2 = new Scanner(System.in).nextInt();
        double quotient = (double) number1 / number2;
        System.out.println("Сумма двух чисел = "+ (number1+number2));
        System.out.println("Разность двух чисел = "+ (number1-number2));
        System.out.println("Умножение двух чисел = "+ (number1*number2));
        System.out.println("Частное = "+ (quotient));
    }
}