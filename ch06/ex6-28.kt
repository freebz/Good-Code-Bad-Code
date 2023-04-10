// 예제 6.28 명백한 코드

class SignupFlow {
  private final UserDisplay userDisplay;
  private final LocalizedMessages messages;


  // 법규 준수를 할 수 없는 경우에는 거짓을 반환하는데
  // 이것은 등록 절차가 더 이상 진행될 수 없음을 의미한다.
  // 법규 준수가 보장되면 참을 반환한다.
  @CheckReturnValue
  Boolean ensureLegalCompliance() {
    String? signupDisclaimer = messages.getSignupDisclaimer();
    if (signupDisclaimer == null) {
      return false;
    }
    userDisplay.displayLegalDisclaimer(signupDisclaimer);
    return true;
  }
}
