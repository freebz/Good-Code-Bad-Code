// 예제 4.3 기본값 반환

class AccountManager {
  private final AccountStore accountStore;
  ...

  Ddouble getAccountBlanceUsd(Int customerId) {
    AccountResult result = accountStore.lookup(customerId);
    if (!result.success()) {
      return 0.0;
    }
    return result.getAccount().getBalanceUsd();
  }
}
