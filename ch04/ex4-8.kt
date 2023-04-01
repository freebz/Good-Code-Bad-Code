// 예제 4.8 검사 예외 발생

class NegativeNumberException extends Exception {
  private final Double erroneousNumber;

  NegativeNumberException(Double erroneousNumber) {
    this.erroneousNumber = erroneousNumber;
  }

  Double getErroneousNumber() {
    return erroneousNumber;
  }
}

Double getSquareRoot(Double value)
    throws NegativeNumberException {
  if (value < 0.0) {
    throw new NegativeNumberException(value);
  }
  return Math.sqrt(value);
}
