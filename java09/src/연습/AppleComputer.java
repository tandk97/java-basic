package 연습;

public class AppleComputer implements Computer{
	@Override
	public void CPU가장착되다() {
		System.out.println("Processor A14");
	}
	
	
	@Override
	public void 그래픽카드가장착되다() {
		System.out.println("내장그래픽이에요");
	}
	
	@Override
	public void SSD가장착되다() {
		System.out.println("512GB이에요");
	}
	
	
	

}
