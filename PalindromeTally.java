import java.util.ArrayList;

public class PalindromeTally {
    public static String palindromeFinder(String[] arr) {
        int num = 0;
        ArrayList<String> collection = new ArrayList<String>();

        for (int i = 0; i < arr.length; i++) {
            boolean palindrome = false;
            String curr = arr[i];

            for (int j = 0; j < curr.length() / 2; j++) {
                if (curr.charAt(j) == curr.charAt(curr.length() - 1 -j)) {
                    palindrome = true;
                } else {
                    j = curr.length();
                }
            }

            if (palindrome) {
                num++;
                collection.add(curr);
            }
        }

        int longest = 0;
        for (String word : collection) {
            if (word.length() > longest) {
                longest = word.length();
            }
        }
        return num + ", " + longest;
    }

    public static void main(String[] args) {
        String[] array = {"fridge", "pottery", "radar", "kitten", "noon", "repaper", "tenet"};
        System.out.println(palindromeFinder(array));
    }
}
