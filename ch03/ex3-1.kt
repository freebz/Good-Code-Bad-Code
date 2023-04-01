// 예제 3.1 세부 조항이 많은 코드

class UserSettings {

  UserSettings() { ... }

  // 이 함수를 사용해 설정이 올바르게 로드되기 전까지는 다른 어떤 함수도
  // 호출해서는 안된다ㅏ.
  // 설정이 성공적으로 로드되면 참을 반환한다.
  Boolean loadSettings(File location) { ... }

  // init()은 다른 함수 호출 이전에 호출해야 하지만
  // loadSettings() 함수 호출 이후에만 호출해야 한다.
  void init() { ... }

  // 사용자가 선택한 UI의 색상을 반환한다.
  // 선택된 색상이 없거나, 설정이 로드되지 않았거나, 초기화되지 않은 상태면
  // 널을 반환한다.
  Color? getUIColor() { ... }
}
