package org.wecancodeit.librarydemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    UserRepository userRepo;
    @Resource
    ItemRepository itemRepo;
    @Resource
    GenreRepository genreRepo;

    @RequestMapping("/users")
    public String displayAllUsers(Model model) {
        model.addAttribute("allUsersModel", userRepo.findAll());
        return "userProfile";

    }

//    @PostMapping("/users")
//    public String addItem(@RequestParam String userName, @RequestParam String zipCode, @RequestParam String genre, @RequestParam String itemsOwned) {
//       Genre genreToAdd;
//        Optional<Genre> genreToAddOpt = genreRepo.findByGenre(genre);
//        if (genreToAddOpt.isEmpty()){
//            genreToAdd = new Genre(genre);
//            genreRepo.save(genreToAdd);
//        }
//        else{
//            genreToAdd = genreToAddOpt.get();
//        }
//        Optional<Item> itemToAddOpt = itemRepo.findByItemName(itemsOwned);
//        if (itemToAddOpt.isEmpty()){
//    }
}