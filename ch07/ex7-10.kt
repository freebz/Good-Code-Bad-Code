// 예제 7.10 방어적 복사

class TextOptions {
  private final List<Font> fontFamily;
  private final Double fontSize;

  TextOptions(List<Font> fontFamily, Double fontSize) {
    this.fontFamily = List.copyOf(fontFamily);
    this.fontSize = fontSize;
  }

  List<Font> getFontFamily() {
    return List.copyOf(fontFamily);
  }

  Double getFontSize() {
    return fontSize;
  }
}
