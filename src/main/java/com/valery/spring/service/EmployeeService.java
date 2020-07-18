package com.valery.spring.service;

import com.valery.spring.dao.EmployeeDao;
import com.valery.spring.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class EmployeeService {

    @Autowired
    private EmployeeService employeeService;

    private final EmployeeDao employeeDao;

    @Transactional
    public Long save(Employee employee) {
        return employeeDao.save(employee);
    }

    @Transactional
    public Optional<Employee> findById(Long id) {
        Optional<Employee> employee = employeeDao.find(id);
        employeeService.findByIdWithNewTransaction(id);

        return employee;
    }

    @Transactional
    public Optional<Employee> findByIdWithNewTransaction(Long id) {
        return employeeDao.find(id);
    }
}
