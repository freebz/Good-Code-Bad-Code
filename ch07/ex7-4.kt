// 예제 7.4 변경되지 않는 TextOptions

class MessageBox {
  private final TextField titleField;
  ...

  vodi renderTitle(String title, TextOptions baseStyle) {
    titleField.display(
	title,
	baseStyle.withFontSize(18.0));
  }
  ...
}
