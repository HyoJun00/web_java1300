package anonymousTest;

public class ClassB implements InterA{

   @Override
   public void printData() {
      System.out.println("InterA를 구현한 클래스에서 오버라이딩");
   }
   
}