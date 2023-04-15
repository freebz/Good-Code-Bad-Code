// 예제 11.8 퍼블릭 API를 통한 테스트

testAssess_badCreditRating_mortgageRejected() {
  Customer customer = new Customer(
      income: new MonetaryAmount(50000, Currency.USD),
      outgoings: new MonetaryAmount(25000, Currency.USD),
      hasGoodCreditRating: false,
      hasExistingMortgage: false,
      isBanned: false);
  MortgageAssessor mortgageAssessor = new MortagageAssessor();

  MortgageDecision decision = mortagageAssessor.assess(customer);

  assertThat(decision.isApproved()).isFalse();
}
