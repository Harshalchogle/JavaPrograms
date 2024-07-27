import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VowelsAndConsonants {
    public static void main(String[] args) {


        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int vowelCount = 0,consonantCount = 0;
        String string = "The best of both worlds";
        string=string.toLowerCase().replace(" ","");
        for (int i = 0; i < string.length(); i++) {
            if(vowels.contains(string.charAt(i))) {
                vowelCount++;
            }
            else {
                consonantCount++;
            }
        }
        System.out.println("vowels:"+vowelCount);
        System.out.println("consonants:"+consonantCount);



        //Using JAVA Stream API
//        List<Character> vowelList = Arrays.asList('a', 'e', 'i', 'o', 'u');
//        Set<Character> vowels = new HashSet<>(vowelList); // Use Set for faster lookup
//        String string = "The best of both worlds";
//
//        // Convert the string to lowercase and remove spaces
//        string = string.toLowerCase().replace(" ", "");
//
//        // Count vowels using streams
//        long vowelCount = string.chars()
//                .mapToObj(c -> (char) c)
//                .filter(vowels::contains)
//                .count();
//
//        // Count consonants using streams
//        long consonantCount = string.chars()
//                .mapToObj(c -> (char) c)
//                .filter(c -> Character.isLetter(c) && !vowels.contains(c))
//                .count();
//
//        System.out.println("Vowels: " + vowelCount);
//        System.out.println("Consonants: " + consonantCount);


    }
}
