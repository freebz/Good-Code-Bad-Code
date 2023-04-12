// 예제 7.15 위치를 위해 페어 유형 사용

class LocationDisplay {
  private final DrawableMap map;


  /**
   * 지도 위에 제공된 좌표의 모든 위치를 표시한다.
   *
   * 페어의 리스트를 받아들이는데, 각 페어는 하나의 위치를 나타낸다.
   * 페어에서 첫 번째 값은 위도이고, 두 번째 값은 경도를 나타낸다.
   * (둘 다 각도 값)
   */
  void markLocationsOnMap(List<Pair<Double, Double>> locations) {
    for (Pair<Double, Double> location in locations) {
      map.markLocation(
	  location.getFirst(),
	  location.getSecond());
    }
  }
}
