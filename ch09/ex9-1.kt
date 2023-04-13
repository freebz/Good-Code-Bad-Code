// 예제 9.1 가정을 포함하는 코드

class Article {
  private List<Section> sections;
  ...

  List<Image> getAllImages() {
    for (Section section in sections) {
      if (section.containsImages()) {
	// 기사 내에 이미지를 포함하는 섹션은 최대
	// 하나만 있다.
	return section.getImages();
      }
    }
    return [];
  }
}
