import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ifPresentOrElseThrow {
    public static void main(String[] args) {


     //ifPresentOrElse
 List<Integer> list=Arrays.asList(1,23,22);
              list.stream().
              filter(a->a<3).findFirst()
              .or(() -> Optional.of(-1)).ifPresentOrElse(System.out::println,
                      ()->
                      System.out.println("Not present"));


        System.out.println(list);



        //or with optional
        Optional<Integer> o1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)
                .stream()
                .filter(x -> x > 2)
                .findFirst()
                .or(() -> Optional.of(-1));
        System.out.println(o1.get());


        //orelsethrow

       list.stream().filter(x->x>1).findFirst().
               or(() -> Optional.of(-1)).orElseThrow();
    }

}
