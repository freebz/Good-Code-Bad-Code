// 예제 4.20 아웃컴 처러

void sayHello(Channel channel) {
  if (sendMessage(channel, "hello")) {
    ui.setOutput("Hello sent");
  } else {
    ui.setError("Unable to send hello");
  }
}
