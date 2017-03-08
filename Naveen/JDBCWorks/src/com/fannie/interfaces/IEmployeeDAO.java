package com.fannie.interfaces;

import java.util.List;

import com.fannie.bean.Employee;

public interface IEmployeeDAO {
	public boolean insertEmployee(Employee emp);
	public List<Employee> getAllEmps();
	public Employee getEmp(int empId);
	public boolean updateEmp(int empId, double newSal);
	public boolean deleteEmp(int empId);
}
