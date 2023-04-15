// 예제 11.24 TextWidget 코드

class TextWidget {
  private const ImmutableList<String> STANDARD_CLASS_NAMES =
      ["text-widget", "selectable"];
  private final ImmutableList<String> customClassNames;

  TextWidget(List<String> customClassNames) {
    this.customClassNames = ImmutableList.copyOf(customClassNames);
  }

  /**
   * 구성요소에 대한 클래스 이름을 반환한다. 반환된 리스트에서 클래스 이름은
   * 특정한 순서를 갖지 않는다.
   */
  ImmutableList<String> getClassNames() {
    return STANDARD_CLASS_NAMES.concat(customClassNames);
  }

  ...
}
