// 예제 6.26 오해를 유발하는 코드

class SignupFlow {
  private final UserDisplay userDisplay;
  private final LocalizedMessages messages;
  ...

  void ensureLegalCompliance() {
    userDisplay.displayLegalDisclaimer(
	messages.getSignupDisclaimer());
  }
}

class LocalizedMessages {
  ...
  // 사용자의 언어가 아닌 기본 설정 언어로 된 텍스트를 제공하는 것은 적법한
  // 것이 아닐 수도 있기 때문에 사용자의 언어로 된 번역 텍스트가 존재하지
  // 않는다면 널을 반환한다.
  String? getSignupDisclaimer() { ... }
  ...
}
