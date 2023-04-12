// 예제 8.14 SemicolonIntFileReader 클래스

/**
 * 파일로부터 정수를 하나씩 읽어 들이기 위한 유틸리티
 * 파일은 세미콜론으로 구분된 값을 가지고 있다.
 */
class SemicolonIntFileReader extends SemicolonIntFileHandler {
  ...

  SemicolonIntFileReader(File file) {
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
