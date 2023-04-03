// 예제 5.2 서술적인 이름 대신 주석문 사용

/** 팀을 나타낸다 */
class T {
  Set<String> pns = new Set(); // 팀에 속한 선수의 이름
  Int s = 0; // 팀의 점수
  ...
  /**
   * @param n 플레이어의 이름
   * @return true 플레이어가 팀에 속해 있는 경우
   */
  Boolean f(String n) {
    return pns.contains(n);
  }

  /**
   * @return 팀의 점수
   */
  Int getS() {
    return s;
  }
}

/**
 * @param ts 모든 팀의 리스트
 * @param n 플레이어의 이름
 * @return 플레이어가 속해 있는 팀의 점수
 */
Int? s(List<T> ts, String n) {
  for (T t in ts) {
    if (t.f(n)) {
      return t.getS();
    }
  }
  return null;
}
