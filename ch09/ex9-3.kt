// 예제 9.3 가정을 포함하는 코드

class Article {
  private List<Section> sections;
  ...

  Section? getImageSection() {
    // 기사 내에 이미지를 포함하는 섹션은 최대
    // 하나만 있다.
    return sections
	.filter(section -> section.containsImages())
	.first();
  }
}
