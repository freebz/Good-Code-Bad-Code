// 예제 6.34 기본 케이스

Boolean isOutcomSafe(PredictedOutcome prediction) {
  switch (prediction) {
    case COMPANY_WILL_GO_BUST:
      return false;
    case COMPANY_WILL_MAKE_A_PROFIT:
      return true;
    default:
      return false;
  }
}
