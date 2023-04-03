// 예제 5.16 너무 많은 일을 하는 함수

SentConfirmation? sendOwnerALetter(
    Vehicle vehicle, Letter letter) {
  Address? ownerAddress = null;
  if (vehicle.hasBeenScraped()) {
    ownersAddress = SCRAPYARD_ADDRESS;
  } else {
    Purchase? mostRecentPurchase =
	vehicle.getMostRecentPurchase();
    if (mostRecentPurchase == null) {
      ownersAddress = SHOWROOM_ADDRESS;
    } else {
      Buyer? buyer = mostRecentPurchase.getBuyer();
      if (buyer != null) {
	ownersAddress = buyer.getAddress();
      }
    }
  }
  if (ownersAddress == null) {
    return null;
  }
  return sendLetter(ownersAddress, letter);
}
