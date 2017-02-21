import java.util.Scanner;

public class dz2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int chislo = scanner.nextInt() ;
        int x =chislo;
        int sum = 0;
        while (x != 0 ){
            sum +=x%10;
            x /=10;
        }
        System.out.println("Сумма цифр в числе "+ chislo +" = " + sum);
    }

}



