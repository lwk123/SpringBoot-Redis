package cn.com.redis.dao;

import org.apache.ibatis.annotations.Param;

import cn.com.redis.entity.Employee;

public interface IEmployeeDao {
	/**
	 * 根据员工ID获取员工信息
	 * @param unid
	 * @return
	 */
	public Employee getEmployeeInfoById(@Param("unid") String unid);
}
