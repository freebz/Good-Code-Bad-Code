// 예제 10.4 목을 사용하는 테스트 케이스

void testSettleInvoice_accountDebited() {
  BankAccount mockAccount = createMock(BankAccount);
  MonetaryAmount invoiceBalance =
      new MonetaryAmount(5.0, Currency.USD);
  Invoice invoice = new Invoice(invoiceBalance, "test-id");
  PaymentManager paymentManager = new PaymentManager();

  paymentManager.settleInvoice(mockAccount, invoice);

  verifyThat(mockAccount.debit)
      .wasCalledOnce()
      .withArguments(invoiceBalance);
}
