// 예제 4.24 비동기 함수

class NegativeNumberError extends Error {
  ...
}

Promise<Double> getSquareRoot(Double value) async {
  await Timer.wait(Duration.ofSeconds(1));
  if (value < 0.0) {
    throw new NegativeNumberError(value);
  }
  return Math.sqrt(value);
}
