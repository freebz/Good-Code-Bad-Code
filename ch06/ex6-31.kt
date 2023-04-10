// 예제 6.31 모든 경우를 처리하는 스위치 문

enum PredictedOutcome {
  COMPANY_WILL_GO_BUST,
  COMPANY_WILL_MAKE_A_PROFIT,
}

...

Boolean isOutcomSafe(PredictedOutcome prediction) {
  switch (prediction) {
    case COMPANY_WILL_GO_BUST:
      return false;
    case COMPANY_WILL_MAKE_A_PROFIT:
      return true;
  }
  throw new UncheckedException(
      "Unhandled prediction: " + prediction);
}
