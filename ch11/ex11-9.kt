// 예제 11.9 더 복잡한 신용 등급 확인

class MortgageAssessor {
  private const Double MORTGAGE_MULTIPLIER = 10.0;
  private const Double GOOD_CREDIT_SCORE_THRESHOLD = 880.0;

  private final CreditScoreService creditScoreService;
  ...

  MortgageDecision assess(Customer customer) {
    ...
  }

  private Result<Boolean, Error> isEligibleForMortgage(
      Customer customer) {
    if (customer.hasExistingMortgage() || customer.isBanned()) {
      return Result.ofValue(false);
    }
    return isCreditRatingGood(customer.getId());
  }

  /** 테스트를 위해서만 공개 */
  Result<Boolean, Error> isCreditRatingGood(Int customerId) {
    CreditScoreResponse response = creditScoreService
	.query(customerId);
    if (response.errorOccurred()) {
      return Result.ofError(response.getError());
    }
    return Result.ofValue(
	response.getCreditScore() >= GOOD_CREDIT_SCORE_THRESHOLD);
  }

  ...
}
