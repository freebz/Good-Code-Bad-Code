// 예제 7.7 깊은 가변성을 갖는 클래스

class TextOptions {
  private final List<Font> fontFamily;
  private final Double fontSize;

  TextOptions(List<Font> fontFamily, Double fontSize) {
    this.fontFamily = fontFamily;
    this.fontSize = fontSize;
  }

  List<Font> getFontFamily() {
    return fontFamily;
  }

  Double getFontSize() {
    return fontSize;
  }
}
