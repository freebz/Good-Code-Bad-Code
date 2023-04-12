// 예제 8.3 하드 코드화된 종속성 설정

class RoutePlanner {
  private const Boolean USE_ONLINE_MAP = true;
  private const Boolean INCLUDE_SEASONAL_ROADS = false;
  
  private final RoadMap roadMap;

  RoutePlanner() {
    this.roadMap = new NorthAmericaRoadMap(
	USE_ONLINE_MAP, INCLUDE_SEASONAL_ROADS);
  }

  Route planRoute(LatLong startPoint, LatLong endPoint) {
    ...
  }
}
