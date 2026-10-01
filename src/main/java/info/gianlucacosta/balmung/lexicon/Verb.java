package info.gianlucacosta.balmung.lexicon;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.*;


@Entity
@Table(name = "Verbs")
public class Verb extends Lemma {
    private String praesens;
    private String praeteritum;
    private String partizipPerfekt;
    private String imperatifSingular;


    Verb() {
    }


    public Verb(
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
                Optional.empty(),
                Optional.empty(),
                Optional.empty()
        );
    }


    public Verb(
            String expression,
            Set<String> categories,
            List<String> syllables,
            Optional<String> pronunciationOption,
            Set<String> synonyms,
            Set<String> antonyms,
            Set<String> hypernyms,
            Optional<String> praesensOption,
            Optional<String> praeteritumOption,
            Optional<String> partizipPerfektOption,
            Optional<String> imperatifSingularOption
    ) {
        super(expression, categories, syllables, pronunciationOption, synonyms, antonyms, hypernyms);

        Objects.requireNonNull(praesensOption);
        Objects.requireNonNull(praeteritumOption);
        Objects.requireNonNull(partizipPerfektOption);
        Objects.requireNonNull(imperatifSingularOption);

        this.praesens = praesensOption.orElse(null);
        this.praeteritum = praeteritumOption.orElse(null);
        this.partizipPerfekt = partizipPerfektOption.orElse(null);
        this.imperatifSingular = imperatifSingularOption.orElse(null);
    }

    public Optional<String> getPraesens() {
        return Optional.ofNullable(praesens);
    }

    public Optional<String> getPraeteritum() {
        return Optional.ofNullable(praeteritum);
    }

    public Optional<String> getPartizipPerfekt() {
        return Optional.ofNullable(partizipPerfekt);
    }

    public Optional<String> getImperatifSingular() {
        return Optional.ofNullable(imperatifSingular);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Verb)) return false;
        if (!super.equals(o)) return false;
        Verb verb = (Verb) o;
        return Objects.equals(praesens, verb.praesens) &&
                Objects.equals(praeteritum, verb.praeteritum) &&
                Objects.equals(partizipPerfekt, verb.partizipPerfekt) &&
                Objects.equals(imperatifSingular, verb.imperatifSingular);
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), praesens, praeteritum, partizipPerfekt, imperatifSingular);
    }

    @Override
    public String toString() {
        return "Verb{" +
                "\n\tlemma info='" + super.toString() +
                ",\n\tpraesens='" + praesens + '\'' +
                ",\n\tpraeteritum='" + praeteritum + '\'' +
                ",\n\tpartizipPerfekt='" + partizipPerfekt + '\'' +
                ",\n\timperatifSingular='" + imperatifSingular + '\'' +
                "\n}";
    }
}
