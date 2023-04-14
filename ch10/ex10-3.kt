// 예제 10.3 BankAccount 인터페이스 및 구현

interface BankAccount {
  void debit(MonetaryAmount amount);
  void credit(MonetaryAmount amount);
  MonetaryAmount getBalance();
}

class BankAccountImpl implements BankAccount {
  private final BankingBackend backend;
  ...

  override void debit(MonetaryAmount amount) { ... }
  override void credit(MonetaryAmount amount) { ... }
  override MonetaryAmount getBalance() { ... }
}
