// 예제 9.13 널값 반환

class UserDocumentSettings {
  private final Font? font;
  ...

  Font? getPreferredFont() {
    return font;
  }
}
