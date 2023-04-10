// 예제 6.3 User 클래스의 상세 내용

class User {
  private final Int? age;
  ...

  // 나이가 주어지지 않은 경우에는 -1을 반환한다.
  Int getAge() {
    if (age == null) {
      return -1;
    }
    return age;
  }
}
