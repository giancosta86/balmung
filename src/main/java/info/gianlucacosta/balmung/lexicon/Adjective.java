package info.gianlucacosta.balmung.lexicon;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.*;


@Entity
@Table(name = "Adjectives")
public class Adjective extends Lemma {
    private String comparative;
    private String superlative;


    Adjective() {
    }


    public Adjective(
            String expression,
            Set<String> categories
    ) {
        this(
                expression,
                categories,
                Collections.emptyList(),
                Optional.empty(),
                Collections.emptySet(),
                Collections.emptySet(),
                Collections.emptySet(),
                Optional.empty(),
                Optional.empty()
        );
    }


    public Adjective(
            String expression,
            Set<String> categories,
            List<String> syllables,
            Optional<String> pronunciationOption,
            Set<String> synonyms,
            Set<String> antonyms,
            Set<String> hypernyms,
            Optional<String> comparativeOption,
            Optional<String> superlativeOption
    ) {
        super(expression, categories, syllables, pronunciationOption, synonyms, antonyms, hypernyms);

        Objects.requireNonNull(comparativeOption);
        Objects.requireNonNull(superlativeOption);

        this.comparative = comparativeOption.orElse(null);
        this.superlative = superlativeOption.orElse(null);
    }

    public Optional<String> getComparative() {
        return Optional.ofNullable(comparative);
    }

    public Optional<String> getSuperlative() {
        return Optional.ofNullable(superlative);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adjective)) return false;
        if (!super.equals(o)) return false;
        Adjective adjective = (Adjective) o;
        return Objects.equals(comparative, adjective.comparative) &&
                Objects.equals(superlative, adjective.superlative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), comparative, superlative);
    }

    @Override
    public String toString() {
        return "Adjective{" +
                "\n\tlemma info='" + super.toString() +
                ",\n\tcomparative='" + comparative + '\'' +
                ",\n\tsuperlative='" + superlative + '\'' +
                "\n}";
    }
}
