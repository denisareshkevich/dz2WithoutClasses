
public class Dz_31 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
        int firstNumber;
        firstNumber = array[array.length - 1];
        System.out.println(firstNumber);
        for(int i = 0; i < array.length-2; i++){
            array[i] = array[i+1];
            System.out.println(array[i]);
        }



    }}