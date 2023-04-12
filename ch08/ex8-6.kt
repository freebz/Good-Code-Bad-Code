// 예제 8.6 정적 함수에 의존

class RoutePlanner {

  Route planRoute(LatLong startPoint, LatLong endPoint) {
    ...
    List<Road> roads = NorthAmericaRoadMap.getRoads();
    List<Junction> junctions =
	NorthAmericaRoadMap.getJunctions();
    ...
  }
}

class NorthAmericaRoadMap {
  ...
  static List<Road> getRoads() { ... }

  static List<Junction> getJunctions() { ... }
}
