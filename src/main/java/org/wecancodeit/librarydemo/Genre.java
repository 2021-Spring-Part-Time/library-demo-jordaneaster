package org.wecancodeit.librarydemo;


import javax.persistence.*;
import java.util.Collection;
import java.util.Locale;
import java.util.Objects;

@Entity
public class Genre {
    //instance data
    @Id
    @GeneratedValue
    private Long id;

    private String genre;



    //getters
    public Long getId() {
        return id;
    }

    public String getGenre() {
        return genre.toUpperCase(Locale.ROOT);
    }


    //relationship data

    @ManyToMany
    private Collection<Item> items;

    //constructor
    public Genre(String genre) {
        this.genre = genre;
    }
    protected Genre(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre = (Genre) o;
        return Objects.equals(id, genre.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString(){
        return String.format("%s",genre);
    }
}
