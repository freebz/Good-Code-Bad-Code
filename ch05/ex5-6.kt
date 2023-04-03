// 예제 5.6 가독성이 더 좋아진 코드

String generateId(String[] data) {
  return firstName(data) + "." lastName(data);
}

String firstName(String[] data) {
  return data[0];
}

String lastName(String[] data) {
  return data[1];
}
