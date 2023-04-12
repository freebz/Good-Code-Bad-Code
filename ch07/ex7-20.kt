// 예제 7.20 Duration 유형 사용

/**
 * @param message 보낼 메시지
 * @param deadline 데드라인이 경과하기전까지 메시지가 전송
 *     되지 않으면 전송은 취소된다.
 * @return 메시지가 전송되면 참을, 그렇지 않으면 거짓
 */
Boolean sendMessage(String message, Duration deadline) {
  ...
}
