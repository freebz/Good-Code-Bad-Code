// 예제 4.25 프로미스의 사용

void displaySquareRoot() {
  getSquareRoot(ui.getInputNumber())
      .then(squareRoot ->
	  ui.setOutput("Square root is: " + squareRoot))
      .catch(error ->
	  ui.setError("An error occurred: " + error.toString()));
}
