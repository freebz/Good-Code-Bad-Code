// 예제 9.20 문자열 유형을 하드 코딩해서 사용

class RandomizedQueue {
  private final List<String> values = [];

  void add(String value) {
    values.add(value);
  }

  /**
   * 큐로부터 무작위로 한 항목을 삭제하고 그 항목을 반환한다.
   */
  String? getNext() {
    if (values.isEmpty()) {
      return null;
    }
    Int randomIndex = Math.randomInt(0, values.size());
    values.swap(randomIndex, values.size() - 1);
    return values.removeLast();
  }
}
