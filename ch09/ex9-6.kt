// 예제 9.6 전역변수를 갖는 클래스

class MyClass {
  private Int a = 3;
  private static Int b = 4;

  void setA(Int value) { a = value; }
  Int getA() { return a; }

  void setB(Int value) { b = value; }
  Int getB() { return b; }

  static Int getStatically() { return b; }
}
