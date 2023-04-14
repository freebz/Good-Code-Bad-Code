// 예제 10.7 마이너스 송장 잔액 테스트

void testSettleInvoice_negativeInvoiceBalance() {
  BankAccount mockAccount = createMock(BankAccount);
  MonetaryAmount invoiceBalance =
      new MonetaryAmount(-5.0, Currency.USD);
  Invoice invoice = new Invoice(invoiceBalance, "test-id");
  PaymentManager paymentManager = new PaymentManager();

  paymentManager.settleInvoice(mockAccount, invoice);

  verifyThat(mockAccount.debit)
      .wasCalledOnce()
      .withArguments(invoiceBalance);
}
