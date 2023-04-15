// 예제 11.25 과도하게 제한된 테스트 어서션

void testGetClassNames_containsCustomClassNames() {
  TextWidget textWidget = new TextWidget(
      ["custom_class_1", "custom_class_2"]);

  assertThat(textWidget.getClassNames()).isEqualTo([
      "text-widget",
      "selectable",
      "custom_class_1",
      "custom_class_2",
  ]);
}
