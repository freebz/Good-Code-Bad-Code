// 예제 9.21 제네릭 사용

class RandomizedQueue<T> {
  private final List<T> values = [];

  void add(T value) {
    values.add(value);
  }

  /**
   * 큐로부터 무작위로 한 항목을 삭제하고 그 항목을 반환한다.
   */
  T? getNext() {
    if (values.isEmpty()) {
      return null;
    }
    Int randomIndex = Math.randomInt(0, values.size());
    values.swap(randomIndex, values.size() - 1);
    return values.removeLast();
  }
}
