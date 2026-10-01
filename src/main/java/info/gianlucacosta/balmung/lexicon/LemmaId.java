package info.gianlucacosta.balmung.lexicon;

import java.io.Serializable;
import java.util.Objects;

class LemmaId implements Serializable {
    public String expression;
    public String categoriesString;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LemmaId)) return false;
        LemmaId lemmaId = (LemmaId) o;
        return Objects.equals(expression, lemmaId.expression) &&
                Objects.equals(categoriesString, lemmaId.categoriesString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expression, categoriesString);
    }
}
