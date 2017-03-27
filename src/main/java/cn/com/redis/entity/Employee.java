package cn.com.redis.entity;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {

	private static final long serialVersionUID = -6081669518819792839L;

	private String unid;//员工ID
	
	private String name;//员工姓名
	
	private int age;//年龄
	
	private String address;//住址
	
	private String workPlace;//工作地点
	
	private Date registerTime;//添加时间

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getUnid() {
		return unid;
	}

	public void setUnid(String unid) {
		this.unid = unid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWorkPlace() {
		return workPlace;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}
	
	
}
