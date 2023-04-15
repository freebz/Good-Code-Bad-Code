// 예제 11.10 두 개의 클래스로 나뉘어진 코드

class CreditRatingChecker {
  private const Double GOOD_CREDIT_SCORE_THRESHOLD = 880.0;

  private final CreditScoreService creditScoreService;
  ...
  
  Result<Boolean, Error> isCreditRatingGood(Int customerId) {
    CreditScoreResponse response = creditScoreService
	.query(customerId);
    if (response.errorOccurred()) {
      return Result.ofError(response.getError());
    }
    return Result.ofValue(
	response.getCreditScore() >= GOOD_CREDIT_SCORE_THRESHOLD);
  }
}

class MortgageAssessor {
  private const Double MORTGAGE_MULTIPLIER = 10.0;
  
  private final CreditRatingChecker creditRatingChecker;
  ...

  MortgageDecision assess(Customer customer) {
    ...
  }

  private Result<Boolean, Error> isEligibleForMortgage(
      Customer customer) {
    if (customer.hasExistingMortgage() || customer.isBanned()) {
      return Result.ofValue(false);
    }
    return creditRatingChecker
	.isCreditRatingGood(customer.getId());
  }
  ...
}
