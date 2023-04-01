// 예제 4.17 리절트 유형 반환

class NegativeNumberError extends Error {
  private final Double erroneousNumber;

  NegativeNumberError(Double erroneousNumber) {
    this.erroneousNumber = erroneousNumber;
  }

  Double getErroneousNumber() {
    return erroneousNumber;
  }
}

Result<Double, NegativeNumberError> getSquareRoot(Double value) {
  if (value < 0.0) {
    return Result.ofError(new NegativeNumberError(value));
  }
  return Result.ofValue(Math.sqrt(value));
}
