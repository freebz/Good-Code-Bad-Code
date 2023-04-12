// 예제 7.19 시간 단위의 불일치

class UiSettings {
  ...

  /**
   * @return UI 메시지를 보여주는 초 단위 기간
   */
  Int64 getMessageTimeout() {
    return 5;
  }
}

...

/**
 * @param message 보여줄 메시지
 * @param timeoutMs 메시지를 보여주는 밀리초 단위의 기간
 */
void showMessage(String message, Int64 timeoutMs) {
  ...
}
