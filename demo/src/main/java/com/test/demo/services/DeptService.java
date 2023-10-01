package com.test.demo.services;

import com.test.demo.model.Departement;
import com.test.demo.reposetry.DepartementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeptService {
    @Autowired
    private DepartementRepo dept;
    public Iterable<Departement> findAll(){
        return dept.findAll();
    }
    public Optional<Departement> findById(Long id){
        return  dept.findById(id);
    }
    public Departement save(Departement departement){
        return dept.save(departement);
    }
}
