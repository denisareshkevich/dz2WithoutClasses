public class Dz_41 {
    public static void main(String[] args) {
        String string = "imeemi";
        System.out.println(isUsualSameToReverse(string));
    }
    private static boolean isUsualSameToReverse(String usualString){
        StringBuilder newUsualString = new StringBuilder(usualString);
      StringBuilder reverseString = newUsualString.reverse();
      return reverseString.equals(newUsualString);
    }
}
