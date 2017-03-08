package com.fanine.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fannie.bean.Employee;
import com.fannie.connection.GetConnection;
import com.fannie.interfaces.IEmployeeDAO;

/**
 * 
 * @author Lenovo
 * @since 2017 
 */

public class EmployeeDAO implements IEmployeeDAO {

	@Override
	/**
	 *  @return boolean 
	 *  @author Lenovo 
	 */
	public boolean insertEmployee(Employee emp) {
		try {
		String sql ="insert into employee (empname, empsal, empemail) values(?,?,?)";
			
			GetConnection gc = new GetConnection();
			gc.ps = GetConnection.mysqlCon().prepareStatement(sql);
			gc.ps.setString(1, emp.getEmpName());
			gc.ps.setDouble(2, emp.getEmpSal());
			gc.ps.setString(3, emp.getEmpEmail());
			
			return gc.ps.executeUpdate() >0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	@Override
	public List<Employee> getAllEmps() {
		// this query may return nothing or all 
		String sql ="select empid, empname, empsal, empemail from employee";
		List<Employee> emps = new ArrayList<Employee>();
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.mysqlCon().prepareStatement(sql);
			
			gc.rs = gc.ps.executeQuery();
			for(;gc.rs.next();){
				Employee temp = new Employee();
				temp.setEmpId(gc.rs.getInt(1));
				temp.setEmpName(gc.rs.getString(2));
				temp.setEmpSal(gc.rs.getDouble(3));
				temp.setEmpEmail(gc.rs.getString(4));
				emps.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return emps;
	}

	@Override
	public Employee getEmp(int empId) {
		String sql ="select empid, empname, empsal, empemail from employee where empid =?";
		
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.mysqlCon().prepareStatement(sql);
			gc.ps.setInt(1, empId);

			gc.rs = gc.ps.executeQuery();
			// since it is checked on primary key either 1 recrod is given 
			// or no record is given 
			if(gc.rs.next()){
				Employee temp = new Employee();
				temp.setEmpId(gc.rs.getInt(1));
				temp.setEmpName(gc.rs.getString(2));
				temp.setEmpSal(gc.rs.getDouble(3));
				temp.setEmpEmail(gc.rs.getString(4));
				
				return temp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return null;
	}
	

	@Override
	public boolean updateEmp(int empId, double newSal) {
		String sql ="update employee set empsal = ? where empid =?";
		
		
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.mysqlCon().prepareStatement(sql);
			gc.ps.setDouble(1, newSal);
			gc.ps.setInt(2, empId);

			
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
 	}

	

	@Override
	public boolean deleteEmp(int empId) {
		String sql ="delete from employee where empid=?";
		
		GetConnection gc = new GetConnection();
		try {
//			GetConnection.mysqlCon().setAutoCommit(false);
			gc.ps = GetConnection.mysqlCon().prepareStatement(sql);
			gc.ps.setInt(1, empId);
			
			return gc.ps.executeUpdate()>0;
			
		} catch (SQLException e) {
			try {
				GetConnection.mysqlCon().rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally{
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		return false;
	}
	
	
}