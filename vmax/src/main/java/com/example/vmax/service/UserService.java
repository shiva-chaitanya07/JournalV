package com.example.vmax.service;

import com.example.vmax.entity.JournalEntry;
import com.example.vmax.entity.User;
import com.example.vmax.repository.JournalEntryRepository;
import com.example.vmax.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public void saveEntry(User journalEntry){
        userRepository.save(journalEntry);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId id){
        return userRepository.findById(id);
    }

    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }

    public User findByUserName(String username){
        return userRepository.findByUsername(username);
    }

}
