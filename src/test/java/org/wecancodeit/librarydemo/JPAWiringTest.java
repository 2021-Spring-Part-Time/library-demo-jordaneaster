package org.wecancodeit.librarydemo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import javax.annotation.Resource;

@DataJpaTest
public class JPAWiringTest {

@Autowired
    private TestEntityManager entityManager;

@Resource
    UserRepository userRepo;
@Resource
    ItemRepository itemRepo;
@Resource
    GenreRepository genreRepo;

    @Test
    public void shouldReturnListOfItemsOwnedByUser(){
        Genre gaming = new Genre("gameConsole");
        Genre phones = new Genre("phone");
        Genre computers = new Genre("computers");
        Genre usedVehichles = new Genre("use cars");
        genreRepo.save(gaming);
        genreRepo.save(phones);
        genreRepo.save(computers);
        genreRepo.save(usedVehichles);

        Item gameConsole = new Item("XBox 360", gaming, "generation II", 100.00);
        Item phone = new Item("Apple Iphone 12",phones,"blue apple iphone 12",800.00);
        Item iMac = new Item("21 inch iMac 2017",computers,"wireless mouse/keyboard power charger included",
                200.00);
        Item car = new Item("Toyota Camry",usedVehichles,"120k miles no check engine",3250.00);

        User jordan = new User("jordan","44111",phone);
        User jermaine = new User("jermaine","44144",gameConsole);
        User john = new User("john","42314",car);
        User jake = new User("jake","16503",iMac);

        itemRepo.save(gameConsole);
        itemRepo.save(car);
        itemRepo.save(iMac);
        itemRepo.save(phone);
        userRepo.save(jake);
        userRepo.save(john);
        userRepo.save(jordan);
        userRepo.save(jermaine);



    }
    @Test
    public void userShouldHaveListOfItems(){


        Genre gaming = new Genre("gameConsole");
        Genre phones = new Genre("phone");
        Item gameConsole = new Item("XBox 360", gaming, "generation II", 100.00);
        Item phone = new Item("Apple Iphone 12",phones,"blue apple iphone 12",800.00);
        User jordan = new User("jordan","44111",phone);
        User jermaine = new User("jermaine","44144",gameConsole);






    }

}
