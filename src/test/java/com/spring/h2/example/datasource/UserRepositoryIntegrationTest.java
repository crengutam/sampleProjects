package com.spring.h2.example.datasource;

import com.spring.h2.example.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by crenguta.soldatu on 26/03/2021.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryIntegrationTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void whenCalledSave_thenCorrectNumberOfUsers() {
        User newTestUser = new User("Bob", "bob@domain.com");
        userRepository.save(newTestUser);
        List<User> users = (List<User>) userRepository.findAll();

        assertThat(users).contains(newTestUser);
    }
}
