// 예제 4.18 리절트 유형 반환

void displaySquareRoot() {
  Result<Double, NegativeNumberError> squareRoot =
      getSquareRoot(ui.getInputNumber());
  if (squareRoot.hasError()) {
    ui.setError("Can't get square root of negative number: " +
	squareRoot.getError().getErroneousNumber());
  } else {
    ui.setOutput("Square root is: " + squareRoot.getValue());
  }
}
