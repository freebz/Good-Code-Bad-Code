// 예제 5.25 익명 함수를 인수로 사용

class List<T> {
  ...
  List<T> filter(Function<T, Boolean> retainIf) {
    ...
  }
}

List<Feedback> getUsefulFeedback(List<Feedback> allFeedback) {
  return allFeedback
      .filter(feedback -> !feedback.getComment().isEmpty());
}
