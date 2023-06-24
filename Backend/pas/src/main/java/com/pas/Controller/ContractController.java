package com.pas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity.HeadersBuilder;

import com.pas.Model.Contrato;
import com.pas.Repository.ContractRepository;

@RestController
@RequestMapping("/contratos")
public class ContractController {
    
    @Autowired
    private ContractRepository contractRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllContracts() {
        return ResponseEntity.ok().body(contractRepository.findAll());
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> signUpContract(@RequestBody Contrato contract) {
        if (contractRepository.existsById(contract.getId())) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok().body(contractRepository.save(contract));
    }

    @DeleteMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public HeadersBuilder<?> deleteContract(@PathVariable("id") Integer id) throws Exception {
        if (!contractRepository.existsById(id)) {
            return ResponseEntity.notFound();
        }

        contractRepository.deleteById(id);
        return ResponseEntity.accepted();
    }
}
