// 예제 9.15 설정에 대한 추상화 계층 나열

class DocumentSettings {
  private final UserDocumentSettings userSettings;
  private final DefaultDocumentSettings defaultSettings;

  DocumentSettings(
      UserDocumentSettings userSettings,
      DefaultDocumentSettings defaultSettings) {
    this.userSettings = userSettings;
    this.defaultSettings = defaultSettings;
  }
  ...

  Font getFont() {
    Font? userFont = userSettings.getPreferredFont();
    if (userFont != null) {
      return userFont;
    }
    return defaultSettings.getFont();
  }
}
