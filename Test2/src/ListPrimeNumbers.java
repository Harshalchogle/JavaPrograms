import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListPrimeNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 2, 4, 6, 9, 11, 10, 16, 13,21);
        list.stream().filter(ListPrimeNumbers::isPrime).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static boolean isPrime(int number) {
        if(number>=1 && number<=3)
            return false;
        else {
            return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
        }
    }
    }
