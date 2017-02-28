import java.util.Arrays;

public class Dz_34 {
    public static void main(String[] args) {
        int[][] openingArray = new int[4][5];
        int countFinalArrayLength = 0;
        for (int i = 0; i < openingArray.length; i++) {
            for (int j = 0; j < openingArray[i].length; j++) {
                openingArray[i][j] = i;
                System.out.println(openingArray[i][j]);
                countFinalArrayLength++;
            }
        }
        int[] finalArray = new int[countFinalArrayLength];
        System.out.println(Arrays.toString(linearize(openingArray, finalArray)));
    }


    private static int [] linearize(int[][] twoDimensionalArray, int[] oneDimensionalArray) {
        int counter = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                 oneDimensionalArray[counter] = twoDimensionalArray[i][j];
                counter++;
            }
        }
        return oneDimensionalArray;
    }

}