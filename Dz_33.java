import java.util.Arrays;

public class Dz_33 {
    public static void main(String[] args) {
        int [] array1 = {1, 2, 3, 4, 5};
        int [] array2 = {6, 7, 8};
        int [] newArray = new int[array1.length + array2.length];
        int longer [] = array1.length >= array2.length ? array1 : array2;
        int shorter [] = array1.length < array2.length ? array1 : array2;
        int k = 0;
        for (int i = 0 ; i < shorter.length; i++) {
            newArray[k] = longer[i];
            k++;
          newArray[k] = shorter[i];
          k++;
        }
        for (int i = shorter.length; i < longer.length; i++){
            newArray[k] = longer[i];
            k++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
