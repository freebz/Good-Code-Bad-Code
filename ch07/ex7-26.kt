// 예제 7.26 값을 읽고 역직렬화하는 코드

class DataLoader {
  ...

  List<Int> loadValues(FileHandler file) {
    return file.readAsString()
	.split(",")
	.map(str -> Int.parse(str, Radix.BASE_10));
  }
}
