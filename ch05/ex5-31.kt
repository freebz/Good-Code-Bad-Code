// 예제 5.31 전통적인 자바 코드로 작성된 리스트 필터링

List<String> getNonEmptyStrings(List<String> strings) {
  List<String> nonEmptyStrings = new ArrayList<>();
  for (String str : strings) {
    if (!str.isEmpty()) {
      nonEmptyStrings.add(str);
    }
  }
  return nonEmptyStrings;
}
