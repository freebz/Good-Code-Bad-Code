// 예제 5.26 명명 함수를 인수로 사용

List<Feedback> getUsefulFeedback(List<Feedback> allFeedback) {
  return allFeedback.filter(hasNonEmptyComment);
}

private Boolean hasNonEmptyComment(Feedback feedback) {
  return !feedback.getComment().isEmpty();
}
