package org.wecancodeit.librarydemo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class User {


    @Id
    @GeneratedValue
    private Long id;

    private String userName;
    private String zipCode;

    @OneToMany
    private Item itemsOwned;


    //getters
    private Collection<Item> items;
    public Collection<Item> getItems(){return items;}

    public String getUserName() {
        return userName;
    }

    public String getZipCode() {
        return zipCode;
    }

    //constructor
    protected User() {
    }

    public User(String userName, String zipCode, Item...items) {
        this.userName = userName;
        this.zipCode = zipCode;
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    @Override
    public String toString() {
        return String.format("User[id=%d, userName=%s, zipCode=%s itemsOwned=%s]",
                id, userName, zipCode,items);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
