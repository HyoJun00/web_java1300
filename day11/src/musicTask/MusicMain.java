package musicTask;

public class MusicMain {
	// MusicMain 클래스
	// 메인메소드
	// check 메소드 -> 객체를 확인해서 해당 클래스에 메소드가 모두 출력되도록 구현
	public static void main(String[] args) {
		Music music1 = new Music();
		Music music2 = new Ballad();
		Music music3 = new HipHop();
		Music music4 = new Rock();
		
		check(music1);
		check(music2);
		check(music3);
		check(music4);
		
	}
	
	static void check(Music music) {
		if(music instanceof Ballad) {
			((Ballad)music).mode();
			((Ballad)music).onlyBallad();
		} else if(music instanceof HipHop) {
			((HipHop)music).mode();
			((HipHop)music).onlyHipHop();
		} else if(music instanceof Rock) {
			((Rock)music).mode();
			((Rock)music).onlyRock();
		} else {
			System.out.println("음악이 켜져있지않습니다.");
		}
	}
	
}
