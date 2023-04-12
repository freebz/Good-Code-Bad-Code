// 예제 7.21 Duration 유형에 캡슐화된 단위

class UiSettings {
  ...

  /**
   * @return UI 메시지를 보여주는 기간
   */
  Duration getMessageTimeout() {
    return Duration.ofSeconds(5);
  }
}

...

/**
 * @param message 보여줄 메시지
 * @param timeout 메시지를 보여주는 시간의 양
 */
void showMessage(String message, Duration timeout) {
  ...
}
