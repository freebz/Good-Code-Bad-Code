// 예제 11.4 오류 처리 테스트

void testDebit_negativeAmount_throwsArgumentException {
  MonetaryAmount negativeAmount =
      new MonetaryAmount(-0.01, Currency.USD);
  BankAccount bankAccount = new BankAccount();

  ArgumentException exception = assertThrows(
      ArgumentException,
      () -> bankAccount.debit(negativeAmount));
  assertThat(exception.getMessage())
      .isEqualTo("액수는 0보다 적을 수 없음");
}
