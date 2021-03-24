package com.igor.crud.spring.santander.config;

import com.igor.crud.spring.santander.domain.User;
import com.igor.crud.spring.santander.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@AllArgsConstructor
public class Instantiation implements CommandLineRunner {

    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        //deleta o DB para popular com dados padrões
        userRepository.deleteAll();

        User u1 = new User(null, "Igor Galvão", "igorgalvao@gec.inatel.br");
        User u2 = new User(null, "Pedro", "pedro@santander.com");
        User u3 = new User(null, "Jose", "jose@santander.com");

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
    }
}
