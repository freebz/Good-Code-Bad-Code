// 예제 6.2 사용자 평균 연령 계산

Double? getMeanAge(List<User> users) {
  if (users.isEmpty()) {
    return null;
  }
  Double sumOfAges = 0.0;
  for (User user in users) {
    sumOfAges += user.getAge().toDouble();
  }
  return sumOfAges / users.size().toDouble();
}
