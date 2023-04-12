// 예제 8.21 UiSettings 및 UserInterface 클래스

class UiSettings {
  ...

  Font getFont() { ... }
  Double getFontSize() { ... }
  Double getLineHeight() { ... }
  Color getTextColor() { ... }
}


class UserInterface {
  private final TextBox messageBox;
  private final UiSettings uiSettings;

  void displayMessage(String message) {
    messageBox.renderText(
	message,
	uiSettings.getFont(),
	uiSettings.getFontSize(),
	uiSettings.getLineHeight(),
	uiSettings.getTextColor());
  }
}
