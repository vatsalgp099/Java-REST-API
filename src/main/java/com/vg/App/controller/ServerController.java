package com.vg.App.controller;
import com.vg.App.model.Server;
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
public class ServerController {

    @Autowired
    private Usrepo repo;

    @GetMapping("/server/all_server")
    public ResponseEntity<?> getAllServer() {
        List<Server> info = repo.findAll();
        if (info.size() > 0) {
            return new ResponseEntity<List<Server>>(info, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No Server available", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/server/add_server")
    public ResponseEntity<?> createServer(@RequestBody Server infos) {
        try {
            infos.setCreatedAt(new Date(System.currentTimeMillis()));
            repo.save(infos);
            return new ResponseEntity<Server>(infos, HttpStatus.OK);
        } catch(Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/server/find_server_name/{name}")
    public ResponseEntity<?> getServerByName(@PathVariable("name") String name) {
            Optional<Server> infosOptional = repo.findById(name);
            if (infosOptional.isPresent()){
                return new ResponseEntity<>(infosOptional.get(), HttpStatus.OK);
            }else {
                return new ResponseEntity<>("404", HttpStatus.NOT_FOUND);
            }
    }

    @PutMapping("/server/update_server_id/{id}")
    public ResponseEntity<?> updateById(@PathVariable("id") String id, @RequestBody Server infos) {
        Optional<Server> infosOptional = repo.findById(id);
        if (infosOptional.isPresent()){
            Server infosToSave = infosOptional.get();
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

    @DeleteMapping("/server/delete_server_id/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") String id) {
        try{
            repo.deleteById(id);
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }

    }
}


