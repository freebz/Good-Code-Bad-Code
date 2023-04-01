// 예제 4.26 리절트 유형 프로미스

Promise<Result<Double, NegativeNumberError>> getSquareRoot(
    Double value) async {
  await Timer.wait(Duration.ofSeconds(1));
  if (value < 0.0) {
    return Result.ofError(new NegativeNumberError(value));
  }
  return Result.ofValue(Math.sqrt(value));
}
