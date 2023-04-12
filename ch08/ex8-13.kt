// 예제 8.13 세미콜론으로 구분된 파일을 읽는 클래스

/**
 * 세미콜론으로 구분된 값을 가지고 있는 파일을 읽거나 쓰기 위한
 * 유틸리티
 */
class SemicolonFileHandler
    implements FileValueReader, FileValueWriter {

  ...

  SemicolonFileHandler(File file) { ... }

  override String? getNextValue() { ... }

  override void writeValue(String value) { ... }

  override void close() { ... }
}
