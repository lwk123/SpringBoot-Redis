package cn.com.redis.service;

import org.apache.ibatis.annotations.Param;

import cn.com.redis.entity.Employee;

public interface IEmployeeService {
	/**
	 * 根据员工ID获取员工信息
	 * @param unid
	 * @return
	 */
	public Employee getEmployeeInfoById(@Param("unid") String unid);
	
	/**
	 * 保存员工信息
	 * @param employeeInfo
	 * @return
	 */
	public boolean saveEmployeeInfo(Employee employeeInfo); 
}
