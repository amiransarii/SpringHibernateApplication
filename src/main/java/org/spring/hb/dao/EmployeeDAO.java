package org.spring.hb.dao;

import java.util.List;

import org.spring.hb.entity.Employee;

public interface EmployeeDAO {
	 
    public void addEmployee(Employee employee);
 
    public List<Employee> getAllEmployees();
 
    public void deleteEmployee(Integer employeeId);
 
    public Employee updateEmployee(Employee employee);
 
    public Employee getEmployee(int employeeid);
}