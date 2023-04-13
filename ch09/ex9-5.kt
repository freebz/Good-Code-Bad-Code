// 예제 9.5 가정의 강제적 확인

class Article {
  private List<Section> sections;
  ...

  Section? getOnlyImageSection() {
    List<Section> imageSections = sections
	.filter(section -> section.containsImages());

    assert(imageSections.size() <= 1,
	   "기사가 여러 개의 이미지 섹션을 갖는다");

    return imageSections.first();
  }
}
