// 예제 9.19 필요한 것만 받는 함수

class TextBox {
  private final Element textElement;
  ...

  void setTextStyle(TextOptions options) {
    setFont(...);
    setFontSize(...);
    setLineHeight(...);
    setTextColor(options.getTextColor());
  }

  void setTextColor(Color color) {
    textElement.setStyleProperty("color", color.asHexRgb());
  }
}
