package com.accenture.lkm.dao;

import com.accenture.lkm.bean.EmployeeBean;

public interface EmployeeDAO {
	
	Integer addEmployee(EmployeeBean employee) throws Exception;
}
