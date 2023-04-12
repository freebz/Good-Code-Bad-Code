// 예제 7.18 순간으로서의 시간 혹은 양으로서의 시간?

/**
 * @param message 보낼 메시지
 * @param deadline 데드라인은 초 단위다.
 *     데드라인이 경과하기까지 메시지가 전송
 *     되지 않으면 전송은 취소된다.
 * @return 메시지가 전송되면 참을 그렇지 않으면 거짓
 */
Boolean sendMessage(String message, Int64 deadline) {
  ...
}
