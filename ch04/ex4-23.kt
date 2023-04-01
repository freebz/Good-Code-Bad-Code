// 예제 4.23 반환값의 강제적 확인

void sayHello(Channel channel) {
  if (sendMessage(channel, "hello")) {
    ui.setOutput("Hello sent");
  } else {
    ui.setError("Unable to send hello");
  }
}
