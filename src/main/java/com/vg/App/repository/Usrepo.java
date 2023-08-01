package com.vg.App.repository;

import com.vg.App.model.Server;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Usrepo extends MongoRepository<Server, String> {

}
