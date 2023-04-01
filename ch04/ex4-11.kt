// 예제 4.11 비검사 예외 발생

class NegativeNumberException extends RuntimeException {
  private final Double erroneousNumber;

  NegativeNumberException(Double erroneousNumber) {
    this.erroneousNumber = erroneousNumber;
  }

  Double getErroneousNumber() {
    return erroneousNumber;
  }
}

/**
 * @throws NegativeNumberException 값이 음수일 경우
 */
Double getSquareRoot(Double value)
    throws NegativeNumberException {
  if (value < 0.0) {
    throw new NegativeNumberException(value);
  }
  return Math.sqrt(value);
}
