import java.util.Arrays;

public class FifthProgram {
    public static void main(String[] args) {

        String word1 = "listen";
        String word2 = "silent";

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
