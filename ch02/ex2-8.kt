// 예제 2.8 하나의 인터페이스 및 단일 구현

interface TextSummarizer {
  String summarizeText(String text);
}

class TextSummarizerImpl implements TextSummarizer {
  ...

  override String summarizeText(String text) {
    return paragraphFinder.find(text)
	.filter(paragraph ->
	    importanceScore.isImportant(paragraph))
	.join("\n\n");
  }
}
