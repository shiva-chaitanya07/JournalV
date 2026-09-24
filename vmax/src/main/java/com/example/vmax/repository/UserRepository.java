package com.example.vmax.repository;

import com.example.vmax.entity.JournalEntry;
import com.example.vmax.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUsername(String username);

}
