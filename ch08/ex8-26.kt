// 예제 8.26 구현 세부 사항을 유출하는 예외

class TextSummarizer {
  private final TextImportanceScorer importanceScorer;
  ...

  String summarizeText(String text) {
    return paragraphFinder.find(text)
	.filter(paragraph =>
		    importanceScorer.isImportant(paragraph))
	.join("\n\n");
  }
}

interface TextImportanceScorer {
  Boolean isImportant(String text);
}

class ModelBasedScorer implements TextImportanceScorer {
  ...
  /**
   * @throws PredictionModelException 예측 모델을 실행하는 동안
   * 에러가 발생하는 경우
   */
  override Boolean isImportant(String text) {
    return model.predict(text) >= MODEL_THRESHOLD;
  }
}
