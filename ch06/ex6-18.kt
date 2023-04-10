// 예제 6.18 예상되는 부수 효과

class UserDisplay() {
  private final Canvas canvas;
  ...

  void displayErrorMessage(String message) {
    canvas.drawText(message, Color.RED);
  }
}
