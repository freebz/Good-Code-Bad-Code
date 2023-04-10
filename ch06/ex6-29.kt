// 예제 6.29 열것값의 암시적 처리

enum PredictedOutcome {
  COMPANY_WILL_GO_BUST,
  COMPANY_WILL_MAKE_A_PROFIT,
}

...

Boolean isOutcomSafe(PredictedOutcome prediction) {
  if (prediction == PredictedOutcome.COMPANY_WILL_GO_BUST) {
    return false;
  }
  return true;
}
