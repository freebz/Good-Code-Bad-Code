// 예제 8.28 계층에 적합한 예외

class TextSummarizerException extends Exception {
  ...
  TextSummarizerException(Throwable cause) { ... }
  ...
}

class TextSummarizer {
  private final TextImportanceScorer importanceScorer;
  ...

  String summarizeText(String text)
      throws TextSummarizerException {
    try {
      return paragraphFinder.find(text)
	  .filter(paragraph =>
	      importanceScorer.isImportant(paragraph))
	  .join("\n\n");
    } catch (TextImportanceScorerException e) {
      throw new TextSummarizerException(e);
    }
  }
}

class TextImportanceScorerException extends Exception {
  ...
  TextImportanceScorerException(Throwable cause) { ... }
  ...
}

interface TextImportanceScorer {
  Boolean isImportant(String text)
      throws TextImportanceScorerException;
}

class ModelBasedScorer implements TextImportanceScorer {
  ...
  Boolean isImportant(String text)
      throws TextImportanceScorerException {
    try {
      return model.predict(text) >= MODEL_THRESHOLD;
    } catch (PredictionModelException e) {
      throw new TextImportanceScorerException(e);
    }
  }
}
