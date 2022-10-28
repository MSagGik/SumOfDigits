import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Привет");
        System.out.println("Введите число");
        int n = enterNumber();
        System.out.println("Сумма цифр в десятичной системе:" + sumDigits(n, 10));

        System.out.println("Введите основание системы");
        int k = enterNumber();
        System.out.println("Сумма цифр в системе " + k + ": " + sumDigits(n, k));
    }

    public static int sumDigits(int n, int base) {
        int sum = 0;
        while (n > 0) {
            sum += n % base;
            n = n / base;
        }
        return sum;
    }

    public static int enterNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        for(;;){
            if (!sc.hasNextInt()) {
                System.out.println("Введено не число. Повторите ввод.");
                sc.nextLine();
                continue;
            }
            number = sc.nextInt();
            if (number > 0)
                return number;
            else
                return -number;
        }
    }
}
