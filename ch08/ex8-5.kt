// 예제 8.5 팩토리 함수

class RoutePlannerFactory {
  ...

  static RoutePlanner createEuropeRoutePlanner() {
    return new RoutePlanner(new EuropeRoadMap());
  }

  static RoutePlanner createDefaultNorthAmericaRoutePlanner() {
    return new RoutePlanner(
	new NorthAmericaRoadMap(true, false));
  }
}
