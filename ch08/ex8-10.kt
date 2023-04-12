// 예제 8.10 CSV 파일을 읽는 클래스

interface FileValueReader {
  String? getNextValue();
  void close();
}

interface FileValueWriter {
  void writeValue(String value);
  void close();
}

/**
 * 쉼표로 구분된 값을 가지고 있는 파일을 읽거나 쓰기 위한
 * 유틸리티
 */
class CsvFileHandler
    implements FileValueReader, FileValueWriter {

  ...

  CsvFileHandler(File file) { ... }

  override String? getNextValue() { ... }

  override void writeValue(String value) { ... }

  override void close() { ... }
}
