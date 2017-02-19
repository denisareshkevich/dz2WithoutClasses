import java.util.Scanner;
public class Maindz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите коэффициенты квадратного уравнения ax^2+bx+c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double Discriminant = Math.pow(b,2) - (4*a*c);
        double Root1 = ((-b + Math.pow(Discriminant,(1/2))) / (2 * a));
        double Root2 = ((-b - Math.pow(Discriminant,(1/2))) / (2 * a));
        if (Discriminant < 0) {
            System.out.println("Нет корней");
        } else if (Discriminant == 0) {
            System.out.println("Данное уравнение имеет 1 корень :" + -b / (2 * a));
        } else {
            System.out.println("Данное уравнение имеет два корня :" + Root1);
            System.out.println(Root2);
        }
    }
}