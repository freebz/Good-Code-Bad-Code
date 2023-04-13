// 예제 9.12 기본값 반환

class UserDocumentSettings {
  private final Font? font;
  ...

  Font getPreferredFont() {
    if (font != null) {
      return font;
    }
    return Font.ARIAL;
  }
}
