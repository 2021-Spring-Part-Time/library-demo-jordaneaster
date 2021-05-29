package org.wecancodeit.librarydemo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends CrudRepository<Item,Long> {

    List<Item> findById(long id);
    List<Item> findByAskingPrice(String askingPrice);
    Optional<Item> findByItemName(String itemName);


}
