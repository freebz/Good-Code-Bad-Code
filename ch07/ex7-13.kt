// 예제 7.13 같은 패러다임을 채택한 다른 코드

class MapFeature {
  private final Double latitude;
  private final Double longitude;


  /*
   * 2 개의 요소를 갖는 리스트를 반환한다. 첫 번째 값은 위도를 나타내고
   * 두 번째 값은 경도를 나타낸다(둘 다 각도 값).
   */
  List<Double> getLocation() {
    return [latitude, longitude];
  }
}
