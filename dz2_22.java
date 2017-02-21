import java.util.Scanner;

public class dz2_22 {
    private static long Fib (int N){
        if(N==0)return 0;
        if(N==1)return 1;
        return Fib(N-1)+Fib(N-2);
    }
    public static void main(String[]args){
        System.out.println("Введите число");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for(int N=0;Fib(N)<number;Fib(N++)){
            System.out.println(Fib(N));


    }

}

}
