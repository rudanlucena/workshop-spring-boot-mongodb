package com.arenamilgaru.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.arenamilgaru.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
