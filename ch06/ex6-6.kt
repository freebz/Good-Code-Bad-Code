// 예제 6.6 최솟값 찾기

Int minValue(List<Int> values) {
  Int minValue = Int.MAX_VALUE;
  for (Int value in values) {
    minValue = Math.min(value, minValue);
  }
  return minValue;
}
