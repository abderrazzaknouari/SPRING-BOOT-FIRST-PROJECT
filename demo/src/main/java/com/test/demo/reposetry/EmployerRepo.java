package com.test.demo.reposetry;

import com.test.demo.model.Employer;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployerRepo extends CrudRepository<Employer,Long> {
   // @EntityGraph(attributePaths = {"departement","user"})
    //List<Employer> findAll();
}
