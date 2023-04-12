// 예제 8.11 클래스 상속

/**
 * 파일로부터 숫자를 하나씩 읽어 들이는 유틸리티
 * 파일은 쉼표로 구분된 값을 가지고 있어야 한다.
 */
class IntFileReader extends CsvFileHandler {
  ...

  IntFileReader(File file) {
    super(file);
  }

  Int? getNextInt() {
    String? nextValue = getNextValue();
    if (nextValue == null) {
      return null;
    }
    return Int.parse(nextValue, Radix.BASE_10);
  }
}
