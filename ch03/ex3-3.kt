// 예제 3.3 세부 조항이 거의 없는 코드

class UserSettings {

  private UserSettings() { ... }

  static UserSettings? create(File location) {
    UserSettings settings = new UserSettings();
    if (!settings.loadSettings(location)) {
      return null;
    }
    settings.init();
    return settings;
  }

  private Boolean loadSettings(File location) { ... }

  private void init() { ... }

  // 사용자는 선택한 UI 색상을 반환한다. 색상을 선택하지 않은 경우에는
  // 널을 반환한다.
  Color? getUiColor() { ... }
}
