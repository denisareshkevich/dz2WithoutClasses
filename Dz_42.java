public class Dz_42 {
    public static void main(String[] args) {
        String romanNumersString = "MDCLXVI";
        System.out.println(changerRomanToArabic(romanNumersString));
    }

    private static int changerRomanToArabic(String openingString) {
        StringBuilder newOpeningString = new StringBuilder(openingString);
        int sum = 0;
        for (int i = 0; i < newOpeningString.length(); i++) {
            sum += symbolAdapter(newOpeningString.charAt(i));
        }
        return sum;
    }

    private static int symbolAdapter(char neededSymbol) {
        int element ;
        if (neededSymbol == 'M') {
             element = 1000;
        } else if (neededSymbol == 'D') {
             element = 500;
        } else if (neededSymbol == 'C') {
             element = 100;
        } else if (neededSymbol == 'L') {
             element = 50;
        } else if (neededSymbol == 'X') {
             element = 10;
        } else if (neededSymbol == 'V') {
             element = 5;
        } else if (neededSymbol == 'I') {
             element = 1;
        } else return 0;
        return element;
    }
}

