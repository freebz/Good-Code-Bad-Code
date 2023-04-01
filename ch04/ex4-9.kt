// 예제 4.9 검사 예외의 포착

void displaySquareRoot() {
  Double value = ui.getInputNumber();
  try {
    ui.setOutput("Square root is: " + getSquareRoot(value));
  } catch (NegativeNumberException e) {
    ui.setError("Can't get square root of negative number: " +
        e.getErroneousNumber());
  }
}
