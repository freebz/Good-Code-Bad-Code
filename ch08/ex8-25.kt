// 예제 8.25 반환 유형이 추상화 계층과 일치

class ProfilePictureService {
  private final HttpFetcher httpFetcher;
  ...

  ProfilePictureResult getProfilePicture(Int64 userId) { ... }
}

class ProfilePictureResult {
  ...

  enum Status {
    SUCCESS,
    USER_DOES_NOT_EXIST,
    OTHER_ERROR,
  }

  /**
   * 프로필 사진에 대한 요청이 성공인지 여부를 나타낸다.
   */
  Status getStatus() { ... }

  /**
   * 프로필 사진이 발견된 경우 그 사진의 이미지 데이터
   */
  List<Byte>? getImageData() { ... }
}
