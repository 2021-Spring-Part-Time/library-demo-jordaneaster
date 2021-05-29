package org.wecancodeit.librarydemo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {

    User findById(long id);

    List<User> findByUserName(String userName);

    List<User> findByZipCode(String zipCode);

}
