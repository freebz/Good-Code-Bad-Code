// 예제 6.17 NullCoffeeMug 반환

CoffeeMug getRandomMug(List<CoffeeMug> mugs) {
  if (mugs.isEmpty()) {
    return new NummCoffeeMug();
  }
  return mugs[Math.randomInt(0, mugs.size())];
}
