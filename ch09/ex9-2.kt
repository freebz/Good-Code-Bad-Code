// 예제 9.2 가정을 제거한 코드

class Article {
  private List<Section> sections;
  ...

  List<Image> getAllImages() {
    List<Image> images = [];
    for (Section section in sections) {
      images.addAll(section.getImages());
    }
    return images;
  }
}
