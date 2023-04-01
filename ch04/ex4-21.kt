// 예제 4.21 아웃컴 무시

void sayHello(Channel channel) {
  sendMessage(channel, "hello");
  ui.setOutput("Hello sent");
}
