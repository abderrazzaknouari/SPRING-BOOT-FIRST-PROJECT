package com.test.demo.reposetry;

import com.test.demo.model.Departement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementRepo extends CrudRepository<Departement,Long> {
}
