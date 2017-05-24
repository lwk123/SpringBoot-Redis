import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Configuration
public class TestAspect {
	/**
	 * 
	 * 定义一个切入点.
	 * 
	 * 解释下：
	 *
	 * 
	 * 
	 * ~ 第一个 * 代表任意修饰符及任意返回值.
	 * 
	 * ~ 第二个 * 任意包名
	 * 
	 * ~ 第三个 * 代表任意方法.
	 * 
	 * ~ 第四个 * 定义在web包或者子包
	 * 
	 * ~ 第五个 * 任意方法
	 * 
	 * ~ .. 匹配任意数量的参数.
	 * 
	 */
	@Pointcut("execution(public * com.janita.aop.one.controller.**.*(..))")
	private void controllerAspect() {
	}

	@Before(value = "controllerAspect()")
	public void methodBefore(JoinPoint joinPoint) {

	}

	@AfterReturning(returning = "o", pointcut = "controllerAspect()")
	public void methodAfterReturning(Object o) {

	}
}
