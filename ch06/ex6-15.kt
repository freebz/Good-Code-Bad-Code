// 예제 6.15 널 반환

CoffeeMug? getRandomMug(List<CoffeeMug> mugs) {
  if (mugs.isEmpty()) {
    return null;
  }
  return mugs[Math.randomInt(0, mugs.size())]
}
