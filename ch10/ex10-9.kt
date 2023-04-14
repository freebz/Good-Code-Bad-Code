// 예제 10.9 마이너스 송장 잔액에 대해 페이크를 사용한 테스트

void testSettleInvoice_negativeInvoiceBalance() {
  FakeBankAccount fakeAccount = new FakeBankAccount(
      new MonetaryAmount(100.0, Currency.USD));
  MonetaryAmount invoiceBalance =
      new MonetaryAmount(-5.0, Currency.USD);
  Invoice invoice = new Invoice(invoiceBalance, "test-id");
  PaymentManager paymentManager = new PaymentManager();

  paymentManager.settleInvoice(fakeAccount, invoice);

  assertThat(fakeAccount.getActualBalance())
      .isEqualTo(new MonetaryAmount(105.0, Currency.USD));
}
