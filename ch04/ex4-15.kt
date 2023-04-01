// 예제 4.15 널 처리

void displaySquareRoot() {
  Double? squareRoot = getSquareRoot(ui.getInputNumber());
  if (squareRoot == null) {
    ui.setError("Can't get square root of negative number");
  } else {
    ui.setOutput("Square root is: " + squareRoot);
  }
}
