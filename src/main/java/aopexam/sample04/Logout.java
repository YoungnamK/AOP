package aopexam.sample04;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component(value="mylogout")
@Aspect@Order(value = 0)
public class Logout {
	@After("execution(public void aopexam.sample04.Board*.*()) || execution(public void aopexam.sample04.Order*.*())")
	public void logout() { // 공통기능 (aspect)
		System.out.println("로그아웃을 수행합니다. ");
	}
}
