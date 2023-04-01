// 예제 4.30 여러 유형의 비검사 예외 처리

Boolean isDataFileValid(byte[] fileContents) {
  try {
    DataFile.parse(fileContents);
    return true;
  } catch (InvalidEncodingException |
	   ParseException |
	   UnrecognizedDataKeyException e) {
    return false;
  }
}
