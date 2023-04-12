// 예제 8.2 설정 가능한 종속성

class NorthAmericaRoadMap implements RoadMap {
  ...

  NorthAmericaRoadMap(
      Boolean useOnlineVersion,
      Boolean includeSeasonalRoads) { ... }

  override List<Road> getRoads() { ... }
  override List<Junction> getJunctions() { ... }
}
