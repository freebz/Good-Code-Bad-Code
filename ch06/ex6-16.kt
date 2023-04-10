// 예제 6.16 널-객체 구현

interface CoffeeMug {
  Double getDiameter();
  Double getHeight();
  void reportMugBroken();
}

class CoffeeMugImpl implements CoffeeMug {
  ...

  override Double getDiameter() { return diameter; }
  override Double getHeight() { return height; }
  override void reportMugBroken() { ... }
}

class NullCoffeeMug implements CoffeeMug {
  override Double getDiameter() { return 0.0; }
  override Double getHeight() { return 0.0; }
  override void reportMugBroken() {
    // 아무 일도 하지 않는다.
  }
}
