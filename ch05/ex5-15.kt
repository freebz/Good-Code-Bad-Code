// 예제 5.15 중첩이 최소화된 코드

Address? getOwnersAddress(Vehicle vehicle) {
  if (vechicle.hasBeenScraped()) {
    return SCRAPYARD_ADDRESS;
  }
  Purchase? mostRecentPurchase =
      vechicle.getMostRecentPurchase();
  if (mostRecentPurchase == null) {
    return SHOWROOM_ADDRESS;
  }
  Buyer? buyer = mostRecentPurchase.getBuyer();
  if (buyer != null) {
    return buyer.getAddress();
  }
  return null;
}
