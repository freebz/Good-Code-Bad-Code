// 예제 7.23 요청 시 잔액 계산

class UserAccount {
  private final Double credit;
  private final Double debit;

  UserAccount(Double credit, Double debit) {
    this.credit = credit;
    this.debit = debit;
  }

  Double getCredit() {
    return credit;
  }

  Double getDebit() {
    return debit;
  }

  Double getBalance() {
    return credit - debit;
  }
}
