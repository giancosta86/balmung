package info.gianlucacosta.balmung.lexicon;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;


public class LemmaTest {
    @Test
    public void testEquality() {
        Lemma lemma = new Lemma(
                "Expression",
                Collections.singleton("Sample Category"),
                Arrays.asList("Syllable 1", "Syllable 2", "Syllable 3", "Syllable 4"),
                Optional.of("Pronunciation"),
                Collections.singleton("Synonym"),
                Collections.singleton("Antonym"),
                Collections.singleton("Hypernym")
        );


        Lemma verySameLemma = new Lemma(
                "Expression",
                Collections.singleton("Sample Category"),
                Arrays.asList("Syllable 1", "Syllable 2", "Syllable 3", "Syllable 4"),
                Optional.of("Pronunciation"),
                Collections.singleton("Synonym"),
                Collections.singleton("Antonym"),
                Collections.singleton("Hypernym")
        );


        assertThat(
                verySameLemma,
                equalTo(lemma)
        );
    }


    @Test
    public void testInequality() {
        Lemma lemma = new Lemma(
                "Expression",
                Collections.singleton("Sample Category"),
                Arrays.asList("Syllable 1", "Syllable 2", "Syllable 3", "Syllable 4"),
                Optional.of("Pronunciation"),
                Collections.singleton("Synonym"),
                Collections.singleton("Antonym"),
                Collections.singleton("Hypernym")
        );


        Lemma verySameLemma = new Lemma(
                "Expression",
                Collections.singleton("Sample Category"),
                Arrays.asList("Syllable 1", "Syllable 2", "Syllable 3", "Syllable 4"),
                Optional.of("Pronunciation"),
                Collections.singleton("Synonym"),
                Collections.singleton("Antonym"),
                Collections.singleton("RANDOM STRING") //This field is different
        );


        assertThat(
                verySameLemma,
                not(equalTo(lemma))
        );
    }


    @Test
    public void testHashCode() {
        Lemma lemma = new Lemma(
                "Expression",
                Collections.singleton("Sample Category"),
                Arrays.asList("Syllable 1", "Syllable 2", "Syllable 3", "Syllable 4"),
                Optional.of("Pronunciation"),
                Collections.singleton("Synonym"),
                Collections.singleton("Antonym"),
                Collections.singleton("Hypernym")
        );


        Lemma verySameLemma = new Lemma(
                "Expression",
                Collections.singleton("Sample Category"),
                Arrays.asList("Syllable 1", "Syllable 2", "Syllable 3", "Syllable 4"),
                Optional.of("Pronunciation"),
                Collections.singleton("Synonym"),
                Collections.singleton("Antonym"),
                Collections.singleton("Hypernym")
        );


        assertThat(
                verySameLemma.hashCode(),
                equalTo(lemma.hashCode())
        );
    }
}
