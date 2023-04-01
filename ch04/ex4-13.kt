// 예제 4.13 비검사 예외를 처리하지 않음

void displaySquareRoot() {
  Double value = ui.getInputNumber();
  ui.setOutput("Square root is: " + getSquareRoot(value));
}
