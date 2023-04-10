// 예제 6.12 ID에 대한 빈 문자열 반환

class Payment {
  private final String? cardTransactionId;
  ...

  String getCardTransactionId() {
    if (cardTransactionId == null) {
      return "";
    }
    return cardTransactionId;
  }
}
