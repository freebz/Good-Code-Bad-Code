// 예제 4.10 검사 예외를 포착하지 않음

void displaySquareRoot() throws NegativeNumberException {
  Double value = ui.getInputNumber();
  ui.setOutput("Square root is: " + getSquareRoot(value));
}
