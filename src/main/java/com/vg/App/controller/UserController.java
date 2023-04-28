package com.vg.App.controller;
import com.vg.App.model.User;
import com.vg.App.repository.Usrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@Component
public class UserController {

    @Autowired
    private Usrepo repo;

    @GetMapping("/info")
    public ResponseEntity<?> getAllUser() {
        List<User> info = repo.findAll();
        if (info.size() > 0) {
            return new ResponseEntity<List<User>>(info, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No User available", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/info")
    public ResponseEntity<?> createInfo(@RequestBody User infos) {
        try {
            infos.setCreatedAt(new Date(System.currentTimeMillis()));
            repo.save(infos);
            return new ResponseEntity<User>(infos, HttpStatus.OK);
        } catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/info/{id}")
    public ResponseEntity<?> getSingleinfo(@PathVariable("id") String id) {
            Optional<User> infosOptional = repo.findById(id);
            if (infosOptional.isPresent()){
                return new ResponseEntity<>(infosOptional.get(), HttpStatus.OK);
            }else {
                return new ResponseEntity<>("404", HttpStatus.NOT_FOUND);
            }
    }

    @PutMapping("/info/{id}")
    public ResponseEntity<?> updateById(@PathVariable("id") String id, @RequestBody User infos) {
        Optional<User> infosOptional = repo.findById(id);
        if (infosOptional.isPresent()){
            User infosToSave = infosOptional.get();
            infosToSave.setName(infos.getName() != null ? infos.getName() : infosToSave.getName());
            infosToSave.setLanguage(infos.getLanguage() != null ? infos.getLanguage() : infosToSave.getLanguage());
            infosToSave.setFramework(infos.getFramework() != null ? infos.getFramework() : infosToSave.getFramework());
            infosToSave.setUpdatedAt(new Date(System.currentTimeMillis()));
            repo.save(infosToSave);
            return new ResponseEntity<>(infosToSave, HttpStatus.OK);
        }else {
            return new ResponseEntity<>("404", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/info/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") String id) {
        try{
            repo.deleteById(id);
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }

    }
}


