package com.pas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pas.Repository.SedeRepository;

@RestController
@RequestMapping("/sede")
public class SedeController {
    
    @Autowired
    private SedeRepository sedeRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getSedes(){
        return ResponseEntity.ok().body(sedeRepository.findAll());
    }

    @DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        sedeRepository.findById(id).orElseThrow(RuntimeException::new);

        sedeRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
