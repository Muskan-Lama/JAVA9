import java.util.Iterator;
import java.util.stream.IntStream;

public class iteratorExample {

    public static void main(String[] args) {

        IntStream.iterate(1,i->i<=10,i->i+2).forEach(System.out::println);

    }
}
