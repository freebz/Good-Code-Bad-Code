// 예제 7.5 빌더 패턴

class TextOptions {
  private final Font font;
  private final Double? fontSize;

  TextOptions(Font font, Double? fontSize) {
    this.font = font;
    this.fontSize = fontSize;
  }

  Font getFont() {
    return font;
  }

  Double? getFontSize() {
    return fontSize;
  }
}

class TextOptionsBuilder {
  private final Font font;
  private Double? fontSize;

  TextOptionsBuilder(Font font) {
    this.font = font;
  }

  TextOptionsBuilder setFontSize(Double fontSize) {
    this.fontSize = fontSize;
    return this;
  }

  TextOptions build() {
    return new TextOptions(font, fontSize);
  }
}
