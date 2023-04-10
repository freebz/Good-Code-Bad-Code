// 예제 6.11 빈 문자열 반환

class UserFeedback {
  private String? additionalComments;
  ...

  String getAdditionalComments() {
    if (additionalComments == null) {
      return "";
    }
    return additionalComments;
  }
}
