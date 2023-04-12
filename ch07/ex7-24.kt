// 예제 7.24 지연 계산 및 캐싱

class UserAccount {
  private final ImmutableList<Transaction> transactions;

  private Double? cachedCredit;
  private Double? cachedDebit;

  UserAccount(ImmutableList<Transaction> transactions) {
    this.transactions = transactions;
  }

  ...

  Double getCredit() {
    if (cachedCredit == null) {
      cachedCredit = transactions
	  .map(transaction -> transaction.getCredit())
	  .sum();
    }
    return cachedCredit;
  }

  Double getDebit() {
    if (cachedDebit == null) {
      cachedDebit = transactions
	  .map(transaction -> transaction.getDebit())
	  .sum();
    }
    return cachedDebit;
  }

  Double getBalance() {
    return getCredit() - getDebit();
  }
}
