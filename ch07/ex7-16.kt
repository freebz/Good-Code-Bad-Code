// 예제 7.16 LatLong 클래스

/**
 * 위도와 경도를 각도로 나타낸다.
 */
class LatLong {
  private final Double latitude;
  private final Double longitude;

  LatLong(Double latitude, Double longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  Double getLatitude() {
    return latitude;
  }

  Double getLongitude() {
    return longitude;
  }
}
