package com.sano.coding.samplemongoDb.repository;

import com.sano.coding.samplemongoDb.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
