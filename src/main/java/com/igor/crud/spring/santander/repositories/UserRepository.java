package com.igor.crud.spring.santander.repositories;

import com.igor.crud.spring.santander.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
