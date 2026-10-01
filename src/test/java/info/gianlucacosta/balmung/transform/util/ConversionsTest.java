package info.gianlucacosta.balmung.transform.util;

import org.junit.Test;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class ConversionsTest {
    private final String testString = "This is a test";

    private final List<Character> testList = Arrays.asList('T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 't', 'e', 's', 't');


    @Test
    public void stringToStreamShouldWork() {
        List<Character> retrievedList =
                Conversions
                        .stringToStream(testString)
                        .collect(Collectors.toList());

        assertThat(
                retrievedList,
                equalTo(testList)
        );
    }


    @Test
    public void streamToStringShouldWork() {
        String retrievedString =
                Conversions
                        .streamToString(testList.stream());

        assertThat(
                retrievedString,
                equalTo(testString)
        );
    }


    @Test
    public void stringToDequeShouldWork() {
        Deque<Character> retrievedDeque =
                Conversions.stringToDeque(testString);

        Deque<Character> expectedDeque =
                new LinkedList<>(testList);

        assertThat(
                retrievedDeque,
                equalTo(expectedDeque)
        );
    }


    @Test
    public void stringToListShouldWork() {
        List<Character> retrievedList =
                Conversions.stringToList(testString);

        assertThat(
                retrievedList,
                equalTo(testList)
        );
    }
}
