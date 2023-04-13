// 예제 9.16 TextOptions 클래스 나열

class TextOptions {
  private final Font font;
  private final Double fontSize;
  private final Double lineHeight;
  private final Color textColor;

  TextOptions(
      Font font,
      Double fontSize,
      Double lineHeight,
      Color textColor) {
    this.font = font;
    this.fontSize = fontSize;
    this.lineHeight = lineHeight;
    this.textColor = textColor;
  }

  Font getFont() { return font; }
  Double getFontSize() { return fontSize; }
  Double getLineHeight() { return lineHeight; }
  Color getTextColor() { return textColor; }
}
