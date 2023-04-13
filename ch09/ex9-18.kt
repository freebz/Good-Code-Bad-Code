// 예제 9.18 너무 많은 매개변수를 받는 함수

void styleAsWarning(TextBox textBox) {
  TextOptions style = new TextOptions(
      Font.ARIAL,
      12.0,
      14.0,
      Color.RED);
  textBox.setTextColor(style);
}
