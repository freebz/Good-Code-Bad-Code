// 예제 11.27 적절한 어서션 확인자

void testGetClassNames_containsCustomClassNames() {
  TextWidget textWidget = new TextWidget(
      ["custom_class_1", "custom_class_2"]);

  assertThat(textWidget.getClassNames())
      .containsAtLeast ("custom_class_1", "custom_class_2");
}
