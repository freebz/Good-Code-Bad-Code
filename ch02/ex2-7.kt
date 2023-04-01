// 예제 2.7 팩토리 함수

TextSummarizer createWordBase3dSummarizer() {
  return new TextSummarizer(
      new ParagraphFinder(), new WordBasedScorer());
}

TextSummarizer createModelBasedSummarizer() {
  return new TextSummarizer(
      new ParagraphFinder(), ModelBasedScorer.create());
}
