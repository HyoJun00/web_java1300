package musicInter;

public class MusicMain {
	public static void main(String[] args) {
		check(new Ballad());
		check(new Rock());
		check(new HipHop());
	}
	
	static void check(Music music) {
		
		if(music instanceof Ballad) {
			((Ballad)music).mode();
			((Ballad)music).onlyBallad();
		} else if(music instanceof Rock) {
			((Rock)music).mode();
			((Rock)music).onlyRock();
		} else if(music instanceof HipHop) {
			((HipHop)music).mode();
			((HipHop)music).onlyHipHop();
		}
		
	}
}
