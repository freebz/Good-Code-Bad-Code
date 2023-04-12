// 예제 8.24 구현 세부 정보를 반환 형식으로 나열

class ProfilePictureService {
  private final HttpFetcher httpFetcher;
  ...

  ProfilePictureResult getProfilePicture(Int64 userId) { ... }
}

class ProfilePictureResult {
  ...

  /**
   * 프로필 사진에 대한 요청이 성공인지 여부를 나타낸다.
   */
  HttpResponse.Status getStatus() { ... }

  /**
   * 프로필 사진이 발견된 경우 그 사잔의 이미지 데이터
   */
  HttpResponse.Payload? getImageData() { ... }
}
