package com.greenfoxacademy.fashionadmin.repositories;

import com.greenfoxacademy.fashionadmin.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findUserByEmail(String email);

    User findUserByActivation(String token);
}
