// 예제 3.2 잠재적인 버그가 있는 코드

void setUiColor(UserSettings userSettings) {
  Color? chosenColor = userSettings.getUiColor();
  if (chosenColor == null) {
    ui.setColor(DEFAULT_UI_COLOR);
    return;
  }
  ui.setColor(chosenColor);
}
