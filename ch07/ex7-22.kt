// 예제 7.22 잔액에 대한 또 다른 진실의 원천

class UserAccount {
  private final Double credit;
  private final Double debit;
  private final Double balance;

  UserAccount(Double credit, Double debit, Double balance) {
    this.credit = credit;
    this.debit = debit;
    this.balance = balance;
  }

  Double getCredit() {
    return credit;
  }

  Double getDebit() {
    return debit;
  }

  Double getBalance() {
    return balance;
  }
}
