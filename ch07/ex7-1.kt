// 예제 7.1 가변 클래스

class TextOptions {
  private Font font;
  private Double fontSize;

  TextOptions(Font font, Double fontSize) {
    this.font = font;
    this.fontSize = fontSize;
  }

  void setFont(Font font) {
    this.font = font;
  }

  void setFontSize(Double fontSize) {
    this.fontSize = fontSize;
  }

  Font getFont() {
    return font;
  }

  Double getFontSize() {
    return fontSize;
  }
}
