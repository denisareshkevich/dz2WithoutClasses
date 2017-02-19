import java.util.Scanner;

public class Maindz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размеры первого дома");
        int HouseSize1_1 = scanner.nextInt();
        int HouseSize1_2 = scanner.nextInt();
        System.out.println("Введите раз меры второго дома");
        int HouseSize2_1 = scanner.nextInt();
        int HouseSize2_2 = scanner.nextInt();
        System.out.println("Введите размеры участка");
        int AreaSize1 = scanner.nextInt();
        int AreaSize2 = scanner.nextInt();
        if ((HouseSize1_1 + HouseSize2_1) <= AreaSize1 && (HouseSize1_2 + HouseSize2_2) <= AreaSize2) {
            System.out.println("Возможно");
        } else if ((HouseSize1_2 + HouseSize2_1) <= AreaSize1 && (HouseSize1_1 + HouseSize2_2) <= AreaSize2) {
            System.out.println("Возможно");
        } else if ((HouseSize1_1 + HouseSize2_1) <= AreaSize2 && (HouseSize1_2 + HouseSize2_2) <= AreaSize1) {
            System.out.println("Возможно");
        } else if ((HouseSize1_2 + HouseSize2_1) <= AreaSize2 && (HouseSize1_1 + HouseSize2_2) <= AreaSize1) {
            System.out.println("Возможно");
        } else System.out.println("Невозможно");
    }
}