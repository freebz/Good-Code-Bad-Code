// 예제 8.8 구체적인 클래스에 의존

interface RoadMap {
  List<Road> getRoads();
  List<Junction> getJunctions();
}

class NorthAmericaRoadMap implements RoadMap {
  ...
}

class RoutePlanner {
  private final NorthAmericaRoadMap roadMap;

  RoutePlanner(NorthAmericaRoadMap roadMap) {
    this.roadMap = roadMap;
  }

  Route planRoute(LatLong startPoint, LatLong endPoint) {
    ...
  }
}
