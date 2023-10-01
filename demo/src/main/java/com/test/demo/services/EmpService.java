package com.test.demo.services;

import com.test.demo.model.Employer;
import com.test.demo.reposetry.EmployerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    private EmployerRepo dept;
    public Iterable<Employer> findAll(){
        return dept.findAll();
    }
    public Long count(){
        return dept.count();
    }
    public Employer save(Employer employer){
        return dept.save(employer);
    }
}
