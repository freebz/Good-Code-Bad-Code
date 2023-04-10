// 예제 6.5 오류가 있는 코드는 컴파일되지 않는다

Double? getMeanAge(List<User> users) {
  if (users.isEmpty()) {
    return null;
  }
  Double sumOfAges = 0.0;
  for (User user in users) {
    sumOfAges += user.getAge().toDouble(); // Compile Error
  }
  return sumOfAges / users.size().toDouble();
}
