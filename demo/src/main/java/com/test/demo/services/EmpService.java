package com.test.demo.services;

import com.test.demo.model.Employer;
import com.test.demo.reposetry.EmployerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    private EmployerRepo emp;

    public Iterable<Employer> findAll(){
        return emp.findAll();
    }
    public Long count(){
        return emp.count();
    }
    public Employer save(Employer employer){
        return emp.save(employer);
    }
    public void delete(Long id){
         emp.deleteById(id);
    }
}
