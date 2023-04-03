// 예제 5.18 타입스크립트에서 객체 구조 분해

interface SendMessageParams {
  message: String,
  priority: number,
  allowRetry: boolean,
}

async function sendMessage(
    {message, priority, allowRetry} : SendMessageParams) {
  const outcome = await XhrWrapper.send(
      END_POINT, message, priority);
  if (outcome.failed() && allowRetry) {
    ...
  }
}
