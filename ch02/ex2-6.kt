// 예제 2.6 인터페이스 및 구현 클래스

interface TextImportanceScorer {
  Boolean isImportant(String text);
}

class WordBasedScorer implements TextImportanceScorer {
  ...
  override Boolean isImportant(String text) {
    return calculateImportance(text) >=
	IMPORTANCE_THRESHOLD;
  }

  private Double calculateImportance(String text) {
    List<String> nouns = extractImportantNouns(paragraph);
    List<String> verbs = extractImportantVerbs(paragraph);
    List<String> adjectives = extractImportantAdjectives(paragraph);
    ... a compilicated equation ...
    return importanceScore;
  }

  private List<String> extractImportantNouns(String text) { ... }
  private List<String> extractImportantVerbs(String text) { ... }
  private List<String> extractImportantAdjectives(String text) { ... }
}

class ModelBasedScorer implements TextImportanceScorer {
  private final TextPredictionModel model;
  ...

  static ModelBasedScorer create() {
    return new ModelBasedScorer(
	TextPredictionModel.load(MODEL_FILE));
  }

  override Boolean isImportant(String text) {
    return model.predict(text) >=
	MODEL_THRESHOLD;
  }
}
