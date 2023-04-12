// 예제 7.12 지나치게 일반적인 데이터 유형

class LocationDisplay {
  private final DrawableMap map;
  ...

  /**
   * 지도 위에 제공된 모든 좌표의 위치를 표시한다.
   *
   * 리스트의 리스트를 받아들이는데, 내부의 리스트는 정확히
   * 두 개의 값을 가지고 있다. 첫 번째 값은 위치의 위도이고
   * 두 번째 값은 경도를 나타낸다(둘 다 각도 값).
   */
  void markLocationsOnMap(List<List<Double>> location) {
    for (List<Double> location in locations) {
      map.markLocation(location[0], location[1]);
    }
  }
}
