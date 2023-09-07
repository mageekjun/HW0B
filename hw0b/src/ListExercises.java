import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /**
     * Returns the total sum in a list of integers
     */
    public static int sum(List<Integer> L) {
        int all = 0;
        for (int i : L) {
            all += i;
        }
        return all;
    }

    /**
     * Returns a list containing the even numbers of the given list
     */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : L) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }
        return result;
    }

    /**
     * Returns a list containing the common item of the two given lists
     */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> result = new ArrayList<>();

        for (int com1 : L1) {
            for (int com2 : L2) {
                if (com1 == com2) {
                    result.add(com1);
                    break;
                }
            }
        }
        return result;
    }


    /**
     * Returns the number of occurrences of the given character in a list of strings.
     */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;

        for (String str : words) {
            for (char character : str.toCharArray()) {
                if (character == c) {
                    count++;
                }
            }
        }
        return count;
    }
}






