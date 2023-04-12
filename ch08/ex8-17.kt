// 예제 8.17 팩토리 함수

class IntFileReaderFactory {

  IntFileReader createCsvIntReader(File file) {
    return new IntFileReader(new CsvFileHandler(file));
  }

  IntFileReader createSemicolonIntReader(File file) {
    return new IntFileReader(new SemicolonIntFileHandler(file));
  }
}
