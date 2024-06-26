package lambdaTask;

public class Main {
   public static void main(String[] args) {
      // 두수의 곱을 구하는 프로그램
      // 1. MultipleInter.java(인터페이스)에 두 수를 매개변수로 받고
      // 정수값을 반환하는 추상메소드를 만든다

      // 2. Main.java(클래스)에 static 메소드를 선언한다
      // -MultipleInter 타입을 반환한다
      // -이름은 calculater
      // -매개변수는 boolean 타입
      // 매개변수로 true가 들어오면 두 수의 곱을 반환하는 람다식을 만들고
      // false가 들어오면 0을 반환하는 람다식을 만든다
      // 작성된 람다식을 MultipleInter 타입의 변수에 저장하여 반환하는
      // 메소드를 만든다

//      MultipleInter mi2 = (num1, num2) -> num1 * num2;

      MultipleInter result = calculater(false);
      int result2 = result.mul(50, 3);
      System.out.println(result);
      System.out.println(result2);
   }

   // 메소드 static MultipleInter calculater (boolean a)
   // 조건문(if(a)~else)

   static MultipleInter calculater(boolean a) {
      if (a) {
         return (num1, num2) -> num1 * num2;
      } else {
         return (num1, num2) -> 0;
      }
   }

}