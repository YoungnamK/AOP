package aopexam.sample01;

public class AopMain {
	public static void main(String[] args) {
		//상품 주문
		Order myorder = new Order();
		myorder.order();
		System.out.println("------------------");
		
		Board myboard = new Board();
		myboard.board();
	
	}
}
