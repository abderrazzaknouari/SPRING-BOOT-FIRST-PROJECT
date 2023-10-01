package com.test.demo.controller;

import com.test.demo.model.Departement;
import com.test.demo.services.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @GetMapping()
    public Iterable<Departement> findAll(){
        return deptService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Departement> findById(@PathVariable Long id){
        return deptService.findById(id);
    }
    @PostMapping()
    public Departement save(Departement departement){
        return deptService.save(departement);
    }
}
