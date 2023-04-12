// 예제 8.23 캡슐화된 객체를 전달

class UiSettings {
  ...

  TextOptions getTextStyle() { ... }
}

class UserInterface {
  private final TextBox messageBox;
  private final UiSettings uiSettings;

  void displayMessage(String message) {
    messageBox.renderText(
	message, uiSettings.getTextStyle());
  }
}

class TextBox {
  ...

  void renderText(String text, TextOptions textStyle) {
    ...
  }
}
