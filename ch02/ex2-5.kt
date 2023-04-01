// 예제 2.5 각 개념에 대한 별도의 클래스

class TextSummarizer {
  private final ParagraphFinder paragraphFinder;
  private final TextImportanceScorer importanceScorer;

  TextSummarizer(
      ParagraphFinder paragraphFinder,
      TextImportanceScorer importanceScorer) {
    this.paragraphFinder = paragraphFinder;
    this.importanceScorer = importanceScorer;
  }

  static TextSummarizer createDefault() {
    return new TextSummarizer(
	new ParagraphFinder(),
	new TextImportanceScorer());
  }

  String summarizeText(String text) {
    return paragraphFinder.find(text)
	.filter(paragraph ->
            importanceScorer.isImportant(paragraph))
	.join("\n\n");
  }
}

class ParagraphFinder {
  List<String> find(String text) {
    List<String> paragraphs = [];
    Int? start = detectParagraphStartOffset(text, 0);
    while (start != null) {
      Int? end = detectParagraphEndOffset(text, start);
      if (end == null) {
	break;
      }
      paragraphs.add(text.subString(start, end));
      start = detectParagraphStartOffset(text, end);
    }
    retrun paragraphs;
  }

  private Int? detectParagraphStartOffset(
      String text, Int fromOffset) { ... }

  private Int? detectParagraphEndOffset(
      String text, Int fromOffset) { ... }
}

class TextImportanceScorer {
  ...
  Boolean isImportant(String text) {
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
