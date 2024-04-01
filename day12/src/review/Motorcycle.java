package review;

public abstract class Motorcycle extends Vehicle {
	// Motorcycle 클래스 추상클래스 상속받는 클래스
	// 속도 필드(private)
	// 추상클래스 메소드
	
	// 필드
		private int speed;

		@Override
		public void move() {
			System.out.println("오토바이가 움직입니다.");
		}

		@Override
		public void setSpeed(int speed) {
			System.out.println("오토바이의 속도를 " + this.speed + "으로 설정합니다.");
		}

//		@Override
//		public int getSpeed() {
//			System.out.println("현재 속도는 " + this.speed + "입니다.");
//		}
}
