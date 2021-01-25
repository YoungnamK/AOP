package aopexam.sample04;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component(value="mydao")
@Aspect@Order(value = 1)
public class DataBase {	// 공통기능 (aspect)
	@After("execution(public void aopexam.sample04.Board*.*()) || execution(public void aopexam.sample04.Order*.*())")
	public void dao() {
		System.out.println("DB작업을 수행합니다. ");
	}
}
