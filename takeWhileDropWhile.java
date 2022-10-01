import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class takeWhileDropWhile {

    public static void main(String[] args) {


        System.out.println(Arrays.asList(20,22,45,11,223).stream().
                       takeWhile(x->x > 6).collect(Collectors.toList()));

        System.out.println(Arrays.asList(20,22,45,11,223).stream().
                dropWhile(x->x > 6).collect(Collectors.toList()));



    }


}
