// 예제 11.1 주택담보대출 평가 코드

class MortgageAssessor {
  private const Double MORTGAGE_MULTIPLIER = 10.0;

  MortgageDecision assess(Customer customer) {
    if (!isEligibleForMortgage(customer)) {
      return MortgageDecision.rejected();
    }
    return MortgageDecision.approve(getMaxLoanAmount(customer));
  }

  private static Boolean isEligibleForMortgage(Customer customer) {
    return customer.hasGoodCreditRating() &&
	!customer.hasExistingMortgage() &&
	!customer.isBanned();
  }

  private static MonetaryAmount getMaxLoanAmount(Customer customer) {
    return customer.getIncome()
	.minus(customer.getOutgoings())
	.multiplyBy(MORTGAGE_MULTIPLIER);
  }
}
