package info.gianlucacosta.balmung.lexicon;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class NounTest {
    @Test
    public void testEquality() {
        String mainDeclensionTestSuffix = "main";
        String alternativeDeclensionTestSuffix = "alternative";

        Noun noun = new Noun(
                "Expression",
                Collections.singleton("Sample Category"),
                Arrays.asList("Syllable 1", "Syllable 2", "Syllable 3", "Syllable 4"),
                Optional.of("Pronunciation"),
                Collections.singleton("Synonym"),
                Collections.singleton("Antonym"),
                Collections.singleton("Hypernym"),
                Optional.of(Genus.NEUTRAL),
                NounDeclensionTest.createTestNounDeclension(mainDeclensionTestSuffix),
                Optional.of(NounDeclensionTest.createTestNounDeclension(alternativeDeclensionTestSuffix))
        );


        Noun verySameNoun = new Noun(
                "Expression",
                Collections.singleton("Sample Category"),
                Arrays.asList("Syllable 1", "Syllable 2", "Syllable 3", "Syllable 4"),
                Optional.of("Pronunciation"),
                Collections.singleton("Synonym"),
                Collections.singleton("Antonym"),
                Collections.singleton("Hypernym"),
                Optional.of(Genus.NEUTRAL),
                NounDeclensionTest.createTestNounDeclension(mainDeclensionTestSuffix),
                Optional.of(NounDeclensionTest.createTestNounDeclension(alternativeDeclensionTestSuffix))
        );


        assertThat(
                verySameNoun,
                equalTo(noun)
        );
    }


    @Test
    public void testInequality() {
        String mainDeclensionTestSuffix = "main";
        String alternativeDeclensionTestSuffix = "alternative";

        Noun noun = new Noun(
                "Expression",
                Collections.singleton("Sample Category"),
                Arrays.asList("Syllable 1", "Syllable 2", "Syllable 3", "Syllable 4"),
                Optional.of("Pronunciation"),
                Collections.singleton("Synonym"),
                Collections.singleton("Antonym"),
                Collections.singleton("Hypernym"),
                Optional.of(Genus.NEUTRAL),
                NounDeclensionTest.createTestNounDeclension(mainDeclensionTestSuffix),
                Optional.of(NounDeclensionTest.createTestNounDeclension(alternativeDeclensionTestSuffix))
        );


        Noun differentNoun = new Noun(
                "Expression",
                Collections.singleton("Sample Category"),
                Arrays.asList("Syllable 1", "Syllable 2", "Syllable 3", "Syllable 4"),
                Optional.of("Pronunciation"),
                Collections.singleton("Synonym"),
                Collections.singleton("RANDOM VALUE"), //This field changed
                Collections.singleton("Hypernym"),
                Optional.of(Genus.NEUTRAL),
                NounDeclensionTest.createTestNounDeclension(mainDeclensionTestSuffix),
                Optional.of(NounDeclensionTest.createTestNounDeclension(alternativeDeclensionTestSuffix))
        );


        assertThat(
                differentNoun,
                not(equalTo(noun))
        );
    }


    @Test
    public void testHashCode() {
        String mainDeclensionTestSuffix = "main";
        String alternativeDeclensionTestSuffix = "alternative";

        Noun noun = new Noun(
                "Expression",
                Collections.singleton("Sample Category"),
                Arrays.asList("Syllable 1", "Syllable 2", "Syllable 3", "Syllable 4"),
                Optional.of("Pronunciation"),
                Collections.singleton("Synonym"),
                Collections.singleton("Antonym"),
                Collections.singleton("Hypernym"),
                Optional.of(Genus.NEUTRAL),
                NounDeclensionTest.createTestNounDeclension(mainDeclensionTestSuffix),
                Optional.of(NounDeclensionTest.createTestNounDeclension(alternativeDeclensionTestSuffix))
        );


        Noun verySameNoun = new Noun(
                "Expression",
                Collections.singleton("Sample Category"),
                Arrays.asList("Syllable 1", "Syllable 2", "Syllable 3", "Syllable 4"),
                Optional.of("Pronunciation"),
                Collections.singleton("Synonym"),
                Collections.singleton("Antonym"),
                Collections.singleton("Hypernym"),
                Optional.of(Genus.NEUTRAL),
                NounDeclensionTest.createTestNounDeclension(mainDeclensionTestSuffix),
                Optional.of(NounDeclensionTest.createTestNounDeclension(alternativeDeclensionTestSuffix))
        );


        assertThat(
                verySameNoun.hashCode(),
                equalTo(noun.hashCode())
        );
    }
}
