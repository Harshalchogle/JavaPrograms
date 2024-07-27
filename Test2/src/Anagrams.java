import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Anagrams
{
    public static String sortString(String str){
        String collect=Arrays.stream(str.split("")).map(String::toLowerCase)
                .filter(s->!s.isBlank())
                .sorted().collect(Collectors.joining());
        return collect;
    }
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        if(sortString(s1).equals(sortString(s2))){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}
