package features.seventeen.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {

    public static void main(String[] args) {
        oldStyle();
        streamToList();
    }

    private static void oldStyle() {
        Stream<String> stringStream = Stream.of("a", "b", "c");
        List<String> stringList =  stringStream.collect(Collectors.toList());
        for(String s : stringList) {
            System.out.println(s);
        }
    }

    private static void streamToList() {
        Stream<String> stringStream = Stream.of("a", "b", "c");
        List<String> stringList =  stringStream.toList();
        for(String s : stringList) {
            System.out.println(s);
        }
    }
}
