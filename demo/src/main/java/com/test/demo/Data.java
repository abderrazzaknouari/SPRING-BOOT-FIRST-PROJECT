package com.test.demo;

import com.test.demo.model.Departement;
import com.test.demo.model.Employer;
import com.test.demo.model.User;
import com.test.demo.services.DeptService;
import com.test.demo.services.EmpService;
import com.test.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Data implements CommandLineRunner {
    @Autowired
    private EmpService empService;
    @Autowired
    private DeptService deptService;
    @Autowired
    private UserService userService;
    @Override
    public void run(String... args) throws Exception {
        for (int i=0;i<10;i++) {
            String index=String.valueOf(i);
            empService.save(new Employer("emp "+index,new Departement("emp "+index),new User("test"+index+"@gmail.com","pass"+index)));

        }
    }
}
