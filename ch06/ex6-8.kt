// 예제 6.8 빈 리스트에 대해 널값 반환

Int? minValue(List<Int> values) {
  if (values.isEmpty()) {
    return null;
  }
  Int minValue = Int.MAX_VALUE;
  for (Int value in values) {
    minValue = Math.min(value, minValue);
  }
  return minValue;
}
