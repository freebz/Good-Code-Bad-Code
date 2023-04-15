// 예제 11.12 한 번에 모든 것을 테스트하는 코드

void testGetValidCoupons_allBehaviors() {
  Customer customer1 = new Customer("test customer 1");
  Customer customer2 = new Customer("test customer 2");
  Coupon redeemd = new Coupon(
      alreadyRedeemd: true, hasExpired: false,
      issuedTo: customer1, value: 100);
  Coupon expired = new Coupon(
      alreadyRedeemd: false, hasExpired: true,
      issuedTo: customer1, value: 100);
  Coupon issuedToSomeoneElse = new Coupon(
      alreadyRedeemd: true, hasExpired: false,
      issuedTo: customer2, value: 100);
  Coupon valid1 = new Coupon(
      alreadyRedeemd: false, hasExpired: false,
      issuedTo: customer1, valid: 100);
  Coupon valid2 = new Coupon(
      alreadyRedeemd: false, hasExpired: false,
      issuedTo: customer1, value: 150);

  List<Coupon> validCoupons = getValidCoupons(
      [redeemd, expired, issuedToSomeoneElse, valid1, valid2],
      customer1);

  assertThat(validCoupons)
      .containsExactly(valid2, valid1)
      .inOrder();
}
