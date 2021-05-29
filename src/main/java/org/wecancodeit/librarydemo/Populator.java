package org.wecancodeit.librarydemo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private UserRepository userRepo;
    @Resource
    private ItemRepository itemRepo;

    @Resource
    GenreRepository genreRepo;


    @Override
    public void run(String... args) throws Exception {

        Genre gaming = new Genre("Game Consoles");
        Genre phones = new Genre("Phones");
        Genre computers = new Genre("Computers");
        Genre usedVehichles = new Genre("Used Cars");

        genreRepo.save(gaming);
        genreRepo.save(phones);
        genreRepo.save(computers);
        genreRepo.save(usedVehichles);


        Item gameConsole = new Item("XBox 360", gaming, "generation II", 100.00);
        Item phone = new Item("Apple Iphone 12",phones,"blue apple iphone 12",800.00);
        Item iMac = new Item("21 inch iMac 2017",computers,"wireless mouse/keyboard power charger included",
                200.00);
        Item car = new Item("Toyota Camry",usedVehichles,"120k miles no check engine",3250.00);

        User jordan = new User("Jordan","44111",phone);
        User jermaine = new User("Jermaine","44144",gameConsole);
        User john = new User("John","42314",car);
        User jake = new User("Jake","16503",iMac);


        itemRepo.save(gameConsole);
        itemRepo.save(car);
        itemRepo.save(iMac);
        itemRepo.save(phone);

        userRepo.save(jake);
        userRepo.save(john);
        userRepo.save(jordan);
        userRepo.save(jermaine);




    }
}
