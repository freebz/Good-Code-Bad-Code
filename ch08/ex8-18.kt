// 예제 8.18 Book 및 Chapter 클래스

class Book {
  private final List<Chapter> chapters;
  ...

  Int wordCount() {
    return chapters
	.map(getChapterWordCount)
	.sum();
  }

  private static Int getChapterWordCount(Chapter chapter) {
    return chapter.getPrelude().wordCount() +
	chapter.getSections()
	    .map(section -> section.wordCount())
	    .sum();
  }
}

class Chapter {
  ...

  TextBlock getPrelude() { ... }

  List<TextBlock> getSections() { ... }
}
