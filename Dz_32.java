import java.util.Arrays;
import java.util.Random;

public class Dz_32 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(deleteSame(array)));


    }

    static int[] deleteSame(int[] array) {

        int lastUniqueElementIndex = 0;


        for (int i = 1; i < array.length; i++) {
            int val = array[i];
            if (isUnique(array, lastUniqueElementIndex, val)) {
                lastUniqueElementIndex++;
                array[lastUniqueElementIndex] = array[i];

            }
        }

        return  Arrays.copyOf(array, lastUniqueElementIndex+1);
    }

    private static boolean isUnique(int[] array, int lastCorrect, int val) {

        for (int i = 0; i <= lastCorrect; i++) {
            if (array[i] == val) {
                return false;
            }
        }
        return  true;
    }
}


