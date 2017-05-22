package cn.com.redis.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.com.redis.entity.Employee;
import cn.com.redis.service.IEmployeeService;
import cn.com.redis.untils.IdUtils;
import cn.com.redis.untils.RedisUtils;

@RestController
@RequestMapping("/testRedis")
public class TestRedisController {
	@Autowired
	private IEmployeeService employeeService;
	private RedisUtils redisUtils;

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("====in====");
		return "success";
	}

	@RequestMapping(value = "/saveEmployeeInfo", method = RequestMethod.GET)
	public void saveEmployeeInfo() {
		Employee employeeInfo = new Employee();
		for (int i = 0; i < 10; i++) {
			employeeInfo.setUnid(IdUtils.getUUID());
			employeeInfo.setName("罗成");
			employeeInfo.setAge(24);
			employeeInfo.setAddress("武汉");
			employeeInfo.setWorkPlace("软件园");
			employeeInfo.setRegisterTime(new Date());
			employeeService.saveEmployeeInfo(employeeInfo);
			System.out.println("共插入" + i + "条");
		}
	}
	@RequestMapping(value = "/insetRedis", method = RequestMethod.GET)
	@Cacheable(value="test")
	public String getRedisValue() {
		redisUtils.set("mouse", "logit");
		System.out.println("该值已经放入缓存！");
		String value=redisUtils.get("name").toString();
		return value;
	}
}
