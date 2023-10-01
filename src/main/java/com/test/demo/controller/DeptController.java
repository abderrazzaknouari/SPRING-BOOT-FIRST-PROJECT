package com.test.demo.controller;

import com.test.demo.model.Departement;
import com.test.demo.services.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Department")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @GetMapping()
    public Iterable<Departement> findAll(){
        return deptService.findAll();
    }
    @PostMapping()
    public Departement save(Departement departement){
        return deptService.save(departement);
    }
}
