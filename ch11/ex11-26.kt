// 예제 11.26 실패 이유를 제대로 설명해주지 않는 테스트 어서션

void testGetClassNames_containsCustomClassNames() {
  TextWidget textWidget = new TextWidget(
      ["custom_class_1", "custom_class_2"]);

  ImmutableList<String> result = textWidget.getClassNames();

  assertThat(result.contains("custom_class_1")).isTrue();
  assertThat(result.contains("custom_class_2")).isTrue();
}
