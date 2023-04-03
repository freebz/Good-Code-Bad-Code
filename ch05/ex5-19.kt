// 예제 5.19 함수 호출에서의 서술적 유형

class MessagePriority {
  ...
  MessagePriority(Int priority) { ... }
  ...
}

enum RetryPolicy {
  ALLOW_RETRY,
  DISALLOW_RETRY
}

void sendMessage(
    String message,
    MessagePriority priority,
    RetryPolicy retryPolicy) {
  ...
}
