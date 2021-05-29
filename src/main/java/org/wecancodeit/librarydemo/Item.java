package org.wecancodeit.librarydemo;

import javax.persistence.*;
import java.util.Collection;
import java.util.Locale;
import java.util.Objects;


@Entity
public class Item {

    //instance data
    @Id
    @GeneratedValue
    private Long id;

    private String itemName;
    private String description;
    private String askingPrice;

    //relationship data
    @ManyToOne
    private Collection<User> users;

    @ManyToMany
    private Genre genre;

    //getters
    public Collection<User> getUsers() {
        return users;
    }

    public Long getId() {
        return id;
    }

    public String getItemName() {
        return itemName.toUpperCase(Locale.ROOT);
    }

    public Genre getGenre() {
        return genre;
    }

    public String getDescription() {
        return description.toUpperCase(Locale.ROOT);
    }

    public String getAskingPrice() {
        return askingPrice;
    }


    //constructors
    protected Item() {
    }

    public Item(String itemName, Genre genre, String description, double askingPrice) {
        String askingPriceAsString = Double.toString(askingPrice);
        this.itemName = itemName;
        this.genre = genre;
        this.description = description;
        this.askingPrice = askingPriceAsString;
    }


    //overrides
    @Override
    public String toString() {
        return String.format(" %s, %s, %s, %s",
                itemName.toUpperCase(Locale.ROOT), genre, description, "$" + askingPrice);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}