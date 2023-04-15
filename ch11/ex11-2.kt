// 예제 11.2 주택 담보 대출 평가 테스트

testAssess() {
  Customer customer = new Customer(
      income: new MonetaryAmount(50000, Currency.USD),
      outgoings: new MonetaryAmount(20000, Currency.USD),
      hasGoodCreditRating: true,
      hasExistingMortgage: false,
      isBanned: false);
  MortgageAssessor mortgageAssessor = new MortgageAssessor();

  MortgageDecision decision = mortgageAssessor.assess(customer);

  assertThat(decision.isApproved()).isTrue();
  assertThat(decision.getMaxLoanAmount()).isEqualTo(
      new MonetaryAmount(300000, Currency.USD));
}
