package info.gianlucacosta.balmung.lexicon;


public enum Genus {
    MASKULIN,
    NEUTRAL,
    FEMININ;


    public String getShortName() {
        return name().substring(0, 1).toLowerCase();
    }

    public String toString() {
        return getShortName();
    }
}
