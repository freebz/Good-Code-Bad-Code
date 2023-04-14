// 예제 10.6 스텁을 사용하는 테스트 케이스

void testSettleInvoice_insufficientFundsCorrectResultReturned() {
  MonetaryAmount invoiceBalance =
      new MonetaryAmount(10.0, Currency.USD);
  Invoice invoice = new Invoice(invoiceBalance, "test-id");
  BankAccount mockAccount = createMock(BankAccount);
  when(mockAccount.getBalance())
      .thenReturn(new MonetaryAmount(9.99, Currency.USD));
  PaymentManager paymentManager = new PaymentManager();

  PaymentResult result =
      paymentManager.settleInvoice(mockAccount, invoice);

  assertThat(result.getStatus()).isEqualTo(INSUFFICIENT_FUNDS);
}
