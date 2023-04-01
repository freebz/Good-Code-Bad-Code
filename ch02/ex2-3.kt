// 예제 2.3 더 작은 함수

SentConfirmation? sendOwnerALetter(Vehicle vehicle, Letter letter) {
  Address? ownerAddress = getOwnersAddress(vehicle);
  if (ownersAddress == null) {
    return null;
  }
  return sendLetter(ownersAddress, letter);
}

private Address? getOwnersAddress(Vehicle vehicle) {
  if (vehicle.hasBeenScraped()) {
    return SCRAPYARD_ADDRESS;
  }
  Purchase? mostRecentPurchase = vehicle.getMostRecentPurchase();
  if (mostRecentPurchase == null) {
    return SHOWROOM_ADDRESS;
  } 
  return mostRecentPurchase.getBuyersAddress();
}
