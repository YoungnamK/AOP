package aopexam.sample03;

public class BoardPet implements Board {
	@Override
	public void board() {
		String msg="PetShop관련 게시물을 등록합니다.";
		System.out.println(msg);

	}
}
