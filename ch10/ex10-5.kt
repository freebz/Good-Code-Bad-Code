// 예제 10.5 getBalance()를 호출하는 코드

class PaymentManager {
  ...

  PaymentManager settleInvoice(
      BankAccount customerBankAccount,
      Invoice invoice) {
    if (customerBankAccount.getBalance()
	.isLessThan(invoice.getBalance())) {
      return PaymentManager.insufficientFunds(invoice.getId());
    }
    customerBankAccount.debit(invoice.getBalance());
    return PaymentResult.paid(invoice.getId());
  }
}
