package com.valery.spring.service;

import com.valery.spring.config.ApplicationConfiguration;
import com.valery.spring.model.Employee;
import com.valery.spring.model.Gender;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void checkSaveEntity() {
        Long petrId = employeeService.save(Employee.of("Petr", Gender.MALE));
        Assert.assertNotNull(petrId);
    }

    @Test
    public void checkRequiredNew() {
        Long petrId = employeeService.save(Employee.of("Petr", Gender.MALE));
        employeeService.findById(petrId);
        System.out.println();
    }
}
