package com.test.demo.services;

import com.test.demo.model.Departement;
import com.test.demo.reposetry.DepartementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService {
    @Autowired
    private DepartementRepo dept;
    public Iterable<Departement> findAll(){
        return dept.findAll();
    }
    public Departement save(Departement departement){
        return (Departement) dept.save(departement);
    }
}
