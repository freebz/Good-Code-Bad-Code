// 예제 8.4 종속성 주입

class RoutePlanner {
  private final RoadMap roadMap;

  RoutePlanner(RoadMap roadMap) {
    this.roadMap = roadMap;
  }

  Route planRoute(LatLong startPoint, LatLong endPoint) {
    ...
  }
}
