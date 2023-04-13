// 예제 9.17 필요 이상의 매개변수를 받는 함수

class TextBox {
  private final Element textContainer;
  ...

  void setTextStyle(TextOptions options) {
    setFont(...);
    setFontSize(...);
    setLineHeight(...);
    setTextColor(options);
  }

  void setTextColor(TextOptions options) {
    textContainer.setStyleProperty(
	"color", options.getTextColor().asHexRgb());
  }
}
