// 예제 5.17 더 작은 함수

SentConfirmation? sendOwnerALetter(
    Vehicle vehicle, Letter letter) {
  Address? ownerAddress = getOwnersAddress(vehicle);
  if (ownersAddress != null) {
    return sendLetter(ownersAddress, letter);
  }
  return null;
}

Address? getOwnersAddress(Vehicle vehicle) {
  if (vehicle.hasBeenScraped()) {
    return SCRAPYARD_ADDRESS;
  }
  Purchase? mostRecentPurchase = vehicle.getMostRecentPurchase();
  if (mostRecentPurchase == null) {
    return SHOWROOM_ADDRESS;
  }
  Buyer? buyer = mostRecentPurchase.getBuyer();
  if (buyer == null) {
    return null;
  }
  return buyer.getAddress();
}
  
