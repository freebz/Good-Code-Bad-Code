// 예제 9.4 가정에 의존하는 호출자

class ArticleRenderer {
  ...

  void render(Article article) {
    ...
    Section? imageSection = article.getImageSection();
    if (imageSection != null) {
      templateData.setImageSection(imageSection);
    }
    ...
  }
}
