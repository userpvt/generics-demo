package com.valery.spring.dao;

import com.valery.spring.model.Employee;
import java.util.List;

public interface EmployeeDao extends BaseDao<Long, Employee> {

    List<Employee> findByName(String name);
}
