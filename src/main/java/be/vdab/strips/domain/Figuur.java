package be.vdab.strips.domain;

/**
 * @author Birger Huysmans
 * @version 1.0
 */

public class Figuur {
    private final long id;
    private final String naam;

    public Figuur(long id, String naam) {
        this.id = id;
        this.naam = naam;
    }

    public long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }
}
