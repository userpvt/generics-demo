package com.valery.spring.dao;

import com.valery.spring.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl extends BaseDaoImpl<Long, Employee> implements EmployeeDao {

    @Override
    public List<Employee> findByName(String name) {
        return null;
    }
}
