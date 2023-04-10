// 예제 6.36 스위치 문이 끝난 뒤 예외 발생

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
