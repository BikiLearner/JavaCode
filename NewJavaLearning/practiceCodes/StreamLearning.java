package NewJavaLearning.practiceCodes;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StreamLearning {
    public static void main(String [] args){

        //Filter : filter all the elements according to your logic
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(n -> n > 5).forEach(n -> System.out.print(n + " "));
        System.out.println();
        // Map : It is used to transform elements in a stream by applying a function to
        // each element and producing a new stream with the results.
        numbers.stream()
                .map(n -> n * 24).forEach(n -> System.out.print(n + " "));

        // FlatMap : Given a list of lists of strings,
        // flatten them into a single list of strings.
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("one", "two"),
                Arrays.asList("three", "four")
        );
        listOfLists.stream()
                .flatMap(Collection::stream)
                .forEach(n -> System.out.print(n + " "));
        //Distinct : remove duplicate
        numbers.stream()
                .distinct()
                .forEach(n -> System.out.print(n + " "));
// result: [1, 2, 3, 4]





        // we cannot reuse same stream twice
        //data.forEach(System.out::println);
    }
}
