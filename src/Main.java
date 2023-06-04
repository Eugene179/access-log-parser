import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число и нажмите <Enter> ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите следующее число и нажмите <Enter> ");
        int number2 = new Scanner(System.in).nextInt();
        int firstNumber = 5;
        int secondNumber = 10;
        double quotient = (double) firstNumber / secondNumber;
        System.out.println("Сумма двух чисел = "+ (firstNumber+secondNumber));
        System.out.println("Разность двух чисел = "+ (firstNumber-secondNumber));
        System.out.println("Умножение двух чисел = "+ (firstNumber*secondNumber));
        System.out.println("Частное = "+ (quotient));
    }
}