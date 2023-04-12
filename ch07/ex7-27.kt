// 예제 7.27 IntListFormat 클래스

class IntListFormat {
  private const String DELIMITER = ",";
  private const Radix RADIX = Radix.BASE_10;

  String serialize(List<Int> values) {
    return values
	.map(value -> value.toString(RADIX))
	.join(DELIMITER);
  }

  List<Int> deserialize(String serialized) {
    return serialized
	.split(DELIMITER)
	.map(str -> Int.parse(str, RADIX));
  }
}
