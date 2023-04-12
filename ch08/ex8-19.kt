// 예제 8.19 향상된 Book 및 Chapter 클래스

class Book {
  private final List<Chapter> chapters;
  ...

  Int wordCount() {
    return chapters
	.map(getChapterWordCount)
	.sum();
  }
}

class Chapter {
  ...

  TextBlock getPrelude() { ... }

  List<TextBlock> getSections() { ... }

  Int wordCount() {
    return getPrelude().wordCount() +
        getSections()
	    .map(section -> section.wordCount())
	    .sum();
  }
}
