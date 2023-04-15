// 예제 11.7 프라이빗 함수 테스트

testIsEligibleMortgage_badCreditRating_ineligible() {
  Customer customer = new Customer(
      income: new MonetaryAmount(50000, Currency.USD),
      outgoings: new MonetaryAmount(25000, Currency.USD),
      hasGoodCreditRating: false,
      hasExistingMortgage: false,
      isBanned: false);

  assertThat(MortgageAssessor.isEligibleForMortgage(customer))
      .isFalse();
}
