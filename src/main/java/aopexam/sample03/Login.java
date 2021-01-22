package aopexam.sample03;
//로그인과 관련된 공통기능 (Aspect)를 구현하는 클래스
public class Login {
	public void login() {
		System.out.println("로그인 기능을 수행합니다.");
	}
	
	public void welcome() {
		System.out.println("어서오세요... 로그인페이지입니다.");
	}
}
