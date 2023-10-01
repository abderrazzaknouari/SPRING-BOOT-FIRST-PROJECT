package com.test.demo.reposetry;

import com.test.demo.model.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepo extends CrudRepository<Employer,Long> {
}
