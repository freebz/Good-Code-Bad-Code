// 예제 8.12 IntFileReader의 퍼블릭 API

class IntFileReader extends CsvFileHandler {
  ...

  Int? getNextInt() { ... }

  String? getNextValue() { ... }
  void writeValue(String value) { ... }
  void close() { ... }
}
