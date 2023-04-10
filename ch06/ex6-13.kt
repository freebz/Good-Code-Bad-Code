// 예제 6.13 ID에 대해 널을 반환

class Payment {
  private final String? cardTransactionId;
  ...

  String getCardTransactionId() {
    return cardTransactionId;
  }
}
