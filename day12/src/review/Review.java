package review;

public class Review {
   
   //moveSpeed() 메소드 매개변수2개(업캐스팅, 스피드)
   void moveSpeed(Vehicle vehicle, int speed) {
      vehicle.move();
      vehicle.setSpeed(speed);
      System.out.println(vehicle.getClass().getSimpleName() +vehicle.getSpeed());
   }
   
   
   public static void main(String[] args) {
      Review r = new Review();
      r.moveSpeed(new Car(), 10);
//      r.moveSpeed(new Motorcycle(), 10);
      
      
      
      //Truck 클래스 추상클래스 상속받는 클래스
      //속도 필드(private)
      //추상클래스 메소드
      
      //Review클래스
      //main메소드
      //moveSpeed() : 매개변수2개
      //모든 메소드 출력하기
      
   
   }
}
