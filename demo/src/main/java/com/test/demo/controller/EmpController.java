package com.test.demo.controller;

import com.test.demo.model.Employer;
import com.test.demo.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmpController {
    @Autowired
    private EmpService emp;
    @GetMapping()
    public Iterable<Employer> getAll(){
        return emp.findAll();
    }
    @PostMapping()
    public Employer save(@PathVariable Employer employer){
        return emp.save(employer);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        emp.delete(id);
    }
}
