// 예제 8.7 인스턴스를 만들 수 있는 클래스

interface RoadMap {
  List<Road> getRoads();
  List<Junction> getJunctions();
}

class NorthAmericaRoadMap implements RoadMap {
  ...
  override List<Road> getRoads() { ... }
  override List<Junction> getJunctions() { ... }
}
