package cn.com.redis.service;

import org.springframework.beans.factory.annotation.Autowired;

import cn.com.redis.dao.IEmployeeDao;
import cn.com.redis.entity.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private IEmployeeDao employeeDao;
	@Override
	public Employee getEmployeeInfoById(String unid) {
		return employeeDao.getEmployeeInfoById(unid);
	}
	@Override
	public boolean saveEmployeeInfo(Employee employeeInfo) {
		return employeeDao.saveEmployeeInfo(employeeInfo);
	}

}
