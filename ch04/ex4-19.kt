// 예제 4.19 아웃컴 반환

Boolean sendMessage(Channel channel, String message) {
  if (channel.isOpen()) {
    channel.send(message);
    return true;
  }
  return false;
}
