// 예제 8.1 하드 코드로 구현된 종속성

class RoutePlanner {
  private final RoadMap roadMap;

  RoutePlanner() {
    this.roadMap = new NorthAmericaRoadMap();
  }

  Route planRoute(LatLong startPoint, LatLong endPoint) {
    ...
  }
}

interface RoadMap {
  List<Road> getRoads();
  List<Junction> getJunctions();
}

class NorthAmericaRoadMap implements RoadMap {
  ...
  override List<Road> getRoads() { ... }
  override List<Junction> getJunctions() { ... }
}
