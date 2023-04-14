// 예제 10.2 BankAccount에 의존하는 코드

class PaymentManager {
  ...

  PaymentResult settleInvoice(
      BankAccount customerBankAccount,
      Invoice invoice) {
    customerBankAccount.debit(invoice.getBalance());
    return PaymentResult.paid(invoice.getId());
  }
}
