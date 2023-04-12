// 예제 8.22 TextOptions 캡슐화 클래스

class TextOptions {
  private final Font font;
  private final Double fontSize;
  private final Double lineHeight;
  private final Color textColor;

  TextOptions(Font font, Double fontSize,
      Double lineHeihgt, Color textColor) {
    this.font = font;
    this.fontSize = fontSize;
    this.lineHeihgt = lineHeihgt;
    this.textColor = textColor;
  }

  Font getFont() { return font; }
  Double getFontSize() { return fontSize; }
  Double getLineHeight() { return lineHeihgt; }
  Color getTextColor() { return textColor; }
}
