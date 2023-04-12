// 예제 7.2 가변성으로 인한 버그

class UserDisplay {
  private final MessageBox messageBox;

  ...

  void sayHello() {
    TextOptions defaultStyle = new TextOptions(Font.ARIAL, 12.0);
    messageBox.renderTitle("Important message", defaultStyle);
    messageBox.renderMessage("Hello", defaultStyle);
  }
}


class MessageBox {
  private final TextField titleField;
  private final TextField messageField;
  ...

  void renderTitle(String title, TextOptions baseStyle) {
    baseStyle.setFontSize(18.0);
    titleField.display(title, baseStyle);
  }

  void renderMessage(String message, TextOptions style) {
    messageField.display(message, style);
  }
}
