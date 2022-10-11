package 연습;

public class BananaComputer implements Computer{
	@Override
	public void CPU가장착되다() {
		System.out.println("Intel i7 12세대");
	}
	
	
	@Override
	public void 그래픽카드가장착되다() {
		System.out.println("RTX3080이에요");
	}
	
	@Override
	public void SSD가장착되다() {
		System.out.println("1TB이에요");
	}
	
	

}
