package aopexam.sample02;


public class AopMain {
	public static void main(String[] args) {
		Order myorder = new Order();
		myorder.order();
		System.out.println("------------------");
//		
		Board myboard = new Board();
		myboard.board();
	}
}
