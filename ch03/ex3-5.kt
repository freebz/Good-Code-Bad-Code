// 예제 3.5 계약 시행을 위한 어서션 사용

class UserSettings {
  ...

  // 사용자가 선택한 UI의 색상을 반환한다.
  // 선택한 색상이 없으면 널을 반환한다.
  Color? getUiColor() {
    assert(hasBeenInitialized(), "UserSettings가 초기화되지 않음");
    ...
  }
}
