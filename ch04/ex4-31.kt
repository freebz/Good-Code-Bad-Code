// 예제 4.31 모든 유형 예외 처리

Boolean isDataFileValid(byte[] fileContents) {
  try {
    DataFile.parse(fileContents);
    return true;
  } catch (Exception e) {
    return false;
  }
}
