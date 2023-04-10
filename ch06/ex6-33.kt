// 예제 6.33 열거형의 새로운 값의 처리

Boolean isOutcomSafe(PredictedOutcome prediction) {
  switch (prediction) {
    case COMPANY_WILL_GO_BUST:
    case WORLD_WILL_END:
      return false;
    case COMPANY_WILL_MAKE_A_PROFIT:
      return true;
  }
  throw new UncheckedException(
      "Unhandled prediction: " + prediction);
}
