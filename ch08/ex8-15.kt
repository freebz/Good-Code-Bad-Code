// 예제 8.15 구성을 사용하는 클래스

/**
 * Utility for reading integers from a file one-by-one.
 */
class IntFileReader {
  private final FileValueReader valueReader;

  IntFileReader(FileValueReader valueReader) {
    this.valueReader = valueReader;
  }

  Int? getNextInt() {
    String? nextValue = valueReader.getNextValue();
    if (nextValue == null) {
      return null;
    }
    return Int.parse(nextValue, Radix.BASE_10);
  }

  void close() {
    valueReader.close();
  }
}
