// 예제 11.3 오류를 처리하는 코드

class BankAccount {
  ...
  void debit(MonetaryAmount amount) {
    if (amount.isNegative()) {
      throw new ArgumentException("액수는 0보다 적을 수 없음");
    }
    ...
  }
}
