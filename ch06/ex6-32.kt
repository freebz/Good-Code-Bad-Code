// 예제 6.32 모든 열것값 처리에 대한 단위 테스트

testIsOutcomSafe_allPredictedOutcomeValues() {
  for (PredictedOutcome prediction in
      PredictedOutcome.values()) {
    isOutcomSafe(prediction);
  }
}
