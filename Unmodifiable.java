import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Unmodifiable {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(2,3,21);
       List<Integer> a= list.stream()
                .filter(e->e>1)
                .collect(Collectors.toUnmodifiableList());

        List<Integer> l=List.copyOf(a);
        System.out.println(l);

    }
}
