// 예제 6.27 필수적인 중요 매개변수

class UserDisplay {
  private final LocalizedMessages messages;
  ...

  void displayLegalDisclaimer(String legalText) {
    displayOverlay(
	title: messages.getLegalDisclaimerTitle(),
	message: legalText,
	textColor: Color.RED);
  }
}
