// 예제 5.7 코드가 존재하는 이유를 설명하는 주석문

class User {
  private final Int username;
  private final String firstName;
  private final String lastName;
  private final Version signupVersion;
  ...

  String getUserId() {
    if (signupVersion.isOlderThan("2.0")) {
      // (v2.0 이전에 등록한) 레거시 유저는 이름으로 ID가 부여된다.
      // 자세한 내용은 #4218 이슈를 보라.
      return firstName.toLowerCase() + "." +
	  lastName.toLowerCase();
    }
    // (v2.0 이후로 등록한) 새 유저는 username으로 ID가 부여된다.
    return username;
  }
  ...
}
