// 예제 4.33 컴파일러 경고 표시 억제

class UserInfo {
  private final String realName;

  // 실제 이름을 사용하지 않도록 마이그레이션 작업중이라 displayName이 지금은
  // 사용되지 않는다. 이것은 곧 사용할 것을 대비해 만들어 놓은 변수다.
  // 마이그레이션에 대한 상세한 내용은 이슈 #7462를 참고하라.
  @Suppress("unused")
  private final String displayName;

  UserInfo(String realName, String displayName) {
    this.realName = realName;
    this.displayName = displayName;
  }

  String getRealName() {
    return realName;
  }

  String getDisplayName() {
    return realName;
  }
}
