package com.vg.App.repository;

import com.vg.App.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Usrepo extends MongoRepository<User, String> {

}
