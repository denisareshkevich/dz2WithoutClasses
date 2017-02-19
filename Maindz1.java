import java.util.Scanner;


public class Maindz1 {
    /*как можно вывести текст прямо из класса,чтобы его выводило на экран до того как примет переменные?*/
     static Scanner scanner = new Scanner(System.in);
    static int date = scanner.nextInt();
    static int mounth = scanner.nextInt();
    static int year = scanner.nextInt();
    private static void Vyvoddate()
    {
        System.out.print(date+1);
        System.out.print("."+mounth+".");
        System.out.print(year);
    }
    private static void Vyvodmounth() {
        System.out.print("01.");
        System.out.print(mounth+1);
        System.out.print("."+year);
    }
    public static void main(String[] args) {
        if (date<=0 || date>31){// проверка на числа
            System.out.println("Такого не может быть");
        } else if (mounth<=0 ||mounth>12){ // проверка на месяцы
            System.out.println("Такого не может быть");
        } else if (date > 0 && date < 28) { // самые простые варианты просто + день и даты от 1 до 27
            Vyvoddate();
        }else if (date==28 && mounth==2){ // 28 февраля проверка на високосность
            if ((year % 4 == 0) && year % 100 != 0)
            {
               Vyvoddate();
            } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                Vyvoddate();
            } else {
               Vyvodmounth();
            }
    }   else if (date==29 && mounth==2) { // 29 февраля проверка на високосность
            if ((year % 4 == 0) && year % 100 != 0) {
                Vyvodmounth();
            } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                Vyvodmounth();
            } else {
                System.out.print("В этом году нет такого дня");
            }
    }else if (date>29 && mounth==2) {
            System.out.print("Такого быть не может");
        }else if  (date==30 && (mounth==4 || mounth==6 || mounth==9 || mounth==11)) {// для 30дневных месяцев
            Vyvodmounth();
        }else if (date>30 && (mounth==4 || mounth==6 || mounth==9 || mounth==11)){
            System.out.print("Такого быть не может");
        }else if ((date==28 || date==29 || date==30)&&(mounth==1 || mounth==3 || mounth==5 || mounth==7 || mounth==8 || mounth==10 || mounth==12)){
            Vyvoddate();
        } // для 28 29 30 если они не являются концом месяца
        else if (date==31 && (mounth==1 || mounth==3 || mounth==5 || mounth==7 || mounth==8 || mounth==10)){ //переход на новый месяц если в месяце 31 день
            Vyvodmounth();
        }else if (date==31 && mounth==12){ //переход на новый год
            System.out.print("01.");
            System.out.print(mounth+".");
            System.out.print(year+1);
    }
}}