import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Convert {

    public static void main(String[] args) {

        IntStream.range(1,9)
                .filter(e->e>5)
                .findFirst()
                .stream()
                .mapMulti((number,consumer)->

                        IntStream.rangeClosed(1,10)
                                .forEach(e-> consumer.accept(number*e))
                ).forEach(System.out::println);



    }
}
