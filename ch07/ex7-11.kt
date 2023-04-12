// 예제 7.11 ImmutableList 사용

class TextOptions {
  private final ImmutableList<Font> fontFamily;
  private final Double fontSize;

  TextOptions(ImmutableList<Font> fontFamily, Double fontSize) {
    this.fontFamily = fontFamily;
    this.fontSize = fontSize;
  }

  ImmutableList<Font> getFontFamily() {
    return fontFamily;
  }

  Double getFontSize() {
    return fontSize;
  }
}
