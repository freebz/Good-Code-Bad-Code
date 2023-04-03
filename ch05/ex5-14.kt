// 예제 5.14 깊이 중첩된 if 문

Address? getOwnersAddress(Vehicle vehicle) {
  if (vechicle.hasBeenScraped()) {
    return SCRAPYARD_ADDRESS;
  } else {
    Purchase? mostRecentPurchase =
	vechicle.getMostRecentPurchase();
    if (mostRecentPurchase == null) {
      return SHOWROOM_ADDRESS;
    } else {
      Buyer? buyer = mostRecentPurchase.getBuyer();
      if (buyer != null) {
	return buyer.getAddress();
      }
    }
  }
  return null;
}
