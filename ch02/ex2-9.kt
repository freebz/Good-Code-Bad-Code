// 예제 2.9 너무 얇은 코드 계층

class ParagraphFinder {
  private final OffsetDetector startDetector;
  private final OffsetDetector endDetector;
  ...

  List<String> find(String text) {
    List<String> paragraphs = [];
    Int? start = startDetector.detectOffset(text, 0);
    while (start != null) {
      Int? end = endDetector.detectOffset(text, start);
      if (end == null) {
	break;
      }
      paragraphs.add(text.subString(start, end));
      start = startDetector.detectOffset(text, end);
    }
    return paragraphs;
  }
}

interface OffsetDetector {
  Int? detectOffset(String text, Int fromOffset);
}

class ParagraphStartOffsetDetector implements OffsetDetector {
  override Int? detectOffset(String text, Int fromOffset) { ... }
}

class ParagraphEndOffsetDetector implements OffsetDetector {
  override Int? detectOffset(String text, Int fromOffset) { ... }
}
