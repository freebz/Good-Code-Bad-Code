// 예제 4.14 널값 반환

// 제공되는 값이 음수이면 널을 반환한다.
Double? getSquareRoot(Double value) {
  if (value < 0.0) {
    return null;
  }
  return Math.sqrt(value);
}
