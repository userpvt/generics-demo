package com.valery.spring.dao;

import com.valery.spring.model.Employee;
import com.valery.spring.model.Gender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:application-context.xml")
@Transactional
public class EmployeeDaoTest {

    @Autowired
    private EmployeeDao employeeDao;

    @Value("${db.username}")
    private String username;

    @Value("#{'${numbers}'.split(',')}")
    private List<Integer> numbers;

    @Value("classpath:database.properties")
    private Resource resource;

    @Test
    public void checkContext() {
        assertNotNull(employeeDao);
    }

    @Test
    public void checkSaveEmployee() {
        Long savedId = employeeDao.save(Employee.of("Ivan", Gender.MALE));
        assertNotNull(savedId);

        Optional<Employee> employee = employeeDao.find(savedId);
        assertTrue(employee.isPresent());
    }
}
