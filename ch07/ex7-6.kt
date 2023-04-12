// 예제 7.6 쓰기 시 복사 패턴

class TextOptions {
  private final Font font;
  private final Double? fontSize;

  TextOptions(Font font) {
    this(font, null);
  }

  private TextOptions(Font font, Double? fontSize) {
    this.font = font;
    this.fontSize = fontSize;
  }

  Font getFont() {
    return font;
  }

  Double? getFontSize() {
    return fontSize;
  }

  TextOptions withFont(Font newFont) {
    return new TextOptions(newFont, fontSize);
  }

  TextOptions withFontSize(Double newFontSize) {
    return new TextOptions(font, newFontSize);
  }
}
