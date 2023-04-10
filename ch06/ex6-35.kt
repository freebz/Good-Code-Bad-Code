// 예제 6.35 기본 케이스에서 예외 발생

Boolean isOutcomSafe(PredictedOutcome prediction) {
  switch (prediction) {
    case COMPANY_WILL_GO_BUST:
      return false;
    case COMPANY_WILL_MAKE_A_PROFIT:
      return true;
    default:
      throw new UncheckedException(
	  "Unhandled prediction: " + prediction);
  }
}
