package info.gianlucacosta.balmung.transform.util;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface Conversions {
    static Stream<Character> stringToStream(String sourceString) {
        return sourceString
                .chars()
                .mapToObj(charCode -> (char) charCode);
    }


    static String streamToString(Stream<Character> sourceStream) {
        StringBuilder result = new StringBuilder();

        sourceStream.forEach(result::append);

        return result.toString();
    }


    static Deque<Character> stringToDeque(String source) {
        return
                stringToStream(source)
                        .collect(Collectors.toCollection(LinkedList::new));
    }


    static List<Character> stringToList(String source) {
        return
                stringToStream(source)
                        .collect(Collectors.toList());
    }
}
