// 예제 11.6 프라이빗 함수를 퍼블릭으로 만듬

class MortgageAssessor {
  private const Double MORTGAGE_MULTIPLIER = 10.0;

  MortgageDecision assess(Customer customer) {
    if (!isEligibleForMortgage(customer)) {
      return MortgageDecision.rejected();
    }
    return MortgageDecision.approve(getMaxLoanAmount(customer));
  }

  /** 테스트를 위해서만 공개 */
  static Boolean isEligibleForMortgage(Customer customer) {
    return customer.hasGoodCreditRating() &&
	!customer.hasExistingMortgage() &&
	!customer.isBanned();
  }

  ...
}
