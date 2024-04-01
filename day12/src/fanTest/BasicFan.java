package fanTest;

public class BasicFan implements Fan {
	// Fan 인터페이스를 구현한 클래스 3개
	// 1. BasicFan 클래스
	// 버튼으로 전원켜기, 버튼으로 전원끄기, turbo는 비워둔다

	@Override
	public void on() {
		System.out.println("버튼으로 전원을 킵니다.");
	}

	@Override
	public void off() {
		System.out.println("버튼으로 전원을 끕니다.");
	}

	@Override
	public void turbo() {
		
	}
	
	
	
}
