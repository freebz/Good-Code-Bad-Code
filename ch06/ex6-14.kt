// 예제 6.14 예상을 벗어나는 널 객체

class CoffeeMug {
  ...
  CoffeeMug(Double diameter, Double height) { ... }

  Double getDiameter() { ... }
  Double getHeight() { ... }
}

class CoffeeMugInventory {
  private final List<CoffeeMug> mugs;
  ...
  CoffeeMug getRandomMug() {
    if (mugs.isEmpty()) {
      return new CoffeeMug(diameter: 0.0, height: 0.0);
    }
    return mugs[Math.randomInt(0, mugs.size())];
  }
}
