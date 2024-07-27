import java.util.Comparator;
import java.util.stream.IntStream;

public class LongestPallindromic {
    public static void main(String[] args) {
        String input = "babad";
        String longestPalindrome = findLongestPalindromicSubstring(input);
        System.out.println("Longest Palindromic Substring: " + longestPalindrome);
    }

    public static String findLongestPalindromicSubstring(String s) {
        if (s == null || s.length() == 0) return "";

        int n = s.length();
        return IntStream.range(0, n)
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, n + 1)
                        .mapToObj(j -> s.substring(i, j))
                        .filter(LongestPallindromic::isPalindrome))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    private static boolean isPalindrome(String str) {
        StringBuilder sb=new StringBuilder(str);
        if(sb.reverse().toString().equals(str)){
            return true;
        }else {
            return false;
        }
    }
    }
