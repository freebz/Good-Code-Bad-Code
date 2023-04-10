// 예제 6.25 널이 가능하지만 중요한 매개변수

class UserDisplay {
  private final LocalizedMessages messages;
  ...

  void displayLegalDisclaimer(String? legalText) {
    if (legalText == null) {
      return;
    }
    displayOverlay(
	title: messages.getLegalDisclaimerTitle(),
	message: legalText,
	textColor: Color.RED);
  }
}

class LocalizedMessages {
  ...
  String getLegalDisclaimerTitle();
  ...
}
