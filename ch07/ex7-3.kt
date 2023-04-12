// 예제 7.3 불변 TextOptions 클래스

class TextOptions {
  private final Font font;
  private final Double fontSize;

  TextOptions(Font font, Double fontSize) {
    this.font = font;
    this.fontSize = fontSize;
  }

  Font getFont() {
    return font;
  }

  Double getFontSize() {
    return fontSize;
  }
}
