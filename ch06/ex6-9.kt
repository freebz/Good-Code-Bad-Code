// 예제 6.9 널 값 반환

Set<String>? getClassNames(HtmlElement element) {
  String? attribute = element.getAttribute("class");
  if (attribute == null) {
    return null;
  }
  return new Set(attribute.split(" "));
}
...

Boolean isElementHighlighted(HtmlElement element) {
  Set<String>? classNames = getClassNames(element);
  if (classNames == null) {
    return false;
  }
  return classNames.contains("highlighted");
}
