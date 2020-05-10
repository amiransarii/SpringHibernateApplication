package org.spring.hb.service;

import java.util.List;

import org.spring.hb.entity.Employee;

 
public interface EmployeeService {
     
    public void addEmployee(Employee employee);
 
    public List<Employee> getAllEmployees();
 
    public void deleteEmployee(Integer employeeId);
 
    public Employee getEmployee(int employeeid);
 
    public Employee updateEmployee(Employee employee);
}