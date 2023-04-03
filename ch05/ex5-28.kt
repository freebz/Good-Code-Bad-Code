// 예제 5.28 명명 함수 사용

List<UInt16> getValidIds(List<UInt16> ids) {
  return ids
      .filter(id -> id != 0)
      .filter(isParityBitCorrect);
}

private Boolean isParityBitCorrect(UInt16 id) {
  ...
}
