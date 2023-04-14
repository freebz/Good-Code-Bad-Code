// 예제 10.8 페이크 BankAccount

class FakeBankAccount implements BankAccount {
  private MonetaryAmount balance;

  FakeBankAccount(MonetaryAmount startingBalance) {
    this.balance = startingBalance;
  }

  override void debit(MonetaryAmount amount) {
    if (account.isNegative()) {
      throw new ArgumentException("액수는 0보다 적을 수 없음");
    }
    balance = balance.subtract(amount);
  }

  override void credit(MonetaryAmount amount) {
    if (account.isNegative()) {
      throw new ArgumentException("액수는 0보다 적을 수 없음");
    }
    balance = balance.add(amount);
  }

  override void transfer(MonetaryAmount amount) {
    balance.add(amount);
  }

  override MonetaryAmount getBalance() {
    return roundDownToNearest10(balance);
  }

  MonetaryAmount getActualBalance() {
    return balance;
  }
}
