// 예제 11.5 프라이빗 헬퍼 함수가 있는 클래스

class MortgageAssessor {
  ...

  MortgageDecision assess(Customer customer) { ... }

  private static Boolean isEligibleForMortgage(
      Customer customer) { ... }

  private static MonetaryAmount getMaxLoanAmount(
      Customer customer) { ... }
}
