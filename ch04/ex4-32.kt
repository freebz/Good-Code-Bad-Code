// 예제 4.32 컴파일러 경고를 유발하는 코드

class UserInfo {
  private final String realName;
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
