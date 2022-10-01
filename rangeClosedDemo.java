import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class rangeClosedDemo {


    public static void main(String[] args) {

       //rangeClosed
        IntStream.rangeClosed(1,10).forEach(System.out::println);

        System.out.println();
        //range
        IntStream.range(1,10).forEach(System.out::println);



    }
}
