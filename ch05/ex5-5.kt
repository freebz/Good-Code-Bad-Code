// 예제 5.5 주석문이 있는 이해하기 어려운 코드

String generateId(String[] data) {
  // data[0]는 유저의 이름이고 data[1]은 성이다.
  // "{이름}.{성}"의 형태로 ID를 생성한다.
  return data[0] + "." + data[1];
}
