// 예제 7.14 페어 데이터 유형

class Pair<A, B> {
  private final A first;
  private final B second;

  Pair(A first, B second) {
    this.first = first;
    this.second = second;
  }

  A getFirst() {
    return first;
  }

  B getSecond() {
    return second;
  }
}
