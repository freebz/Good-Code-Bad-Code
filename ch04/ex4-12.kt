// 예제 4.12 비검사 예외 처리

void displaySquareRoot() {
  Double value = ui.getInputNumber();
  try {
    ui.setOutput("Square root is: " + getSquareRoot(value));
  } catch (NegativeNumberException e) {
    ui.setError("Can't get square root of negative number: " +
        e.getErroneousNumber());
  }
}
