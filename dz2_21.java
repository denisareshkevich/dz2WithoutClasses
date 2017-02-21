import java.util.Scanner;

public class dz2_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int a = 0;
        for (int i = 1; i < number;i = i + a) {
            a += i;
            System.out.println(i);
            System.out.println(a);
        }
    }
}