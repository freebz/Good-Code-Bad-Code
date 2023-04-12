// 예제 8.9 인터페이스에 의존

class RoutePlanner {
  private final RoadMap roadMap;

  RoutePlanner(RoadMap roadMap) {
    this.roadMap = roadMap;
  }

  Route planRoute(LatLong startPoint, LatLong endPoint) {
    ...
  }
}
