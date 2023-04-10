// 예제 6.10 빈 집합 반환

Set<String> getClassNames(HtmlElement element) {
  String? attribute = element.getAttribute("class");
  if (attribute == null) {
    return new Set();
  }
  return new Set(attribute.split(" "));
}
...

Boolean isElementHighlighted(HtmlElement element) {
  return getClassNames(element).contains("highlighted");
}
