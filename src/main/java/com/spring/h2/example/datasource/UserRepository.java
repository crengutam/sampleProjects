package com.spring.h2.example.datasource;

import com.spring.h2.example.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by crenguta.soldatu on 26/03/2021.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
