// 예제 3.4 계약 시행을 위한 체크 사용

class UserSettings {

  UserSettings() { ... }


  // 이 함수를 사용해 설정이 올바르게 로드되기 전까지는 다른 어떤 함수도
  // 호출해서는 안된다.
  // 설정이 성공적으로 로드되면 참을 반환한다.
  bool loadSettings(File location) { ... }

  // init()은 다른 함수 호출 이전에 호출해야 하지만
  // loadSettings() 함수 호출 이후에만 호출해야 한다.
  void init() {
    if (!haveSettingsBeenLoaded()) {
      throw new StateException("Settings not loaded");
    }
    ...
  }

  // 사용자가 선택한 UI의 색상을 반환한다.
  // 선택된 색상이 없으면 널을 반환한다.
  Color? getUiColor() {
    if (!hasBeenInitialized()) {
      throw new StateException("Settings not initialized");
    }
    ...
  }
}
