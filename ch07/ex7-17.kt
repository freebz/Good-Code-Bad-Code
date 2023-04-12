// 예제 7.17 LatLong 사용

class LocationDisplay {
  private final DrawableMap map;
  ...

  /**
   * 지도 위에 제공된 모든 좌표의 위치를 표시한다.
   */
  void markLocationsOnMap(List<LatLong> locations) {
    for (LatLong location in locations) {
      map.markLocation(
	  location.getLatitude(),
	  location.getLongitude());
    }
  }
}
