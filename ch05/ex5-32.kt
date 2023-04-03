// 예제 5.32 스트림을 사용한 리스트 필터링

List<String> getNonEmptyStrings(List<String> strings) {
  return strings
      .stream()
      .filter(str -> !str.isEmpty())
      .collect(toList());
}
