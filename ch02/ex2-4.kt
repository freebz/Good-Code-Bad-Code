// 예제 2.4 너무 큰 클래스

class TextSummarizer {
  ...

  String summarizeText(String text) {
    return splitIntoParagraphs(text)
	.filter(paragraph -> calculateImportance(paragraph) >=
	    IMPORTANCE_THRESHOLD)
	.join("\n\n");
  }

  private Double calculateImportance(String paragraph) {
    List<String> nouns = extractImportantNouns(paragraph);
    List<String> verbs = extractImportantVerbs(paragraph);
    List<String> adjectives = extractImportantAdjectives(paragraph);
    ... a compilicated equation ...
    return importanceScore;
  }

  private List<String> extractImportantNouns(String text) { ... }
  private List<String> extractImportantVerbs(String text) { ... }
  private List<String> extractImportantAdjectives(String text) { ... }

  private List<String> splitIntoParagraphs(String text) {
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
