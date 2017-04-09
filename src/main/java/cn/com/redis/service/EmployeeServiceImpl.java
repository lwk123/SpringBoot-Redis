package cn.com.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.redis.dao.IEmployeeDao;
import cn.com.redis.entity.Employee;
@Service("employeeService")
@Transactional(propagation = Propagation.REQUIRED)
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
