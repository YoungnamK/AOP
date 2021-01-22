package aopexam.sample03;
//데이터베이스에 관련된 공통기능 (Aspect)구현해 놓은 클래스
public class DataBase {
	public void dao() {
		System.out.println("데이터베이스 작업을 수행합니다.");
	}
}
