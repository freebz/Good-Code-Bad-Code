// 예제 7.25 값을 직렬화하고 저장하는 코드

class DataLogger {
  private final List<Int> loggedValues;
  ...

  saveValues(FileHandler file) {
    String serializedValues = loggedValues
	.map(value -> value.toString(Radix.BASE_10))
	.join(",");
    file.write(serializedValues);
  }
}
