// 예제 11.13 한 번에 하나씩 테스트

void testGetValidCoupons_validCoupon_included() {
  Customer customer = new Customer("test customer");
  Coupon valid = new Coupon(
      alreadyRedeemed: false, hasExpired: false,
      issuedTo: customer, value: 100);

  List<Coupon> validCoupons = getValidCoupons([valid], customer);

  assertThat(validCoupons).containsExactly(valid);
}

void testGetValidCoupons_alreadyRedeemed_excluded() {
  Customer customer = new Customer("test customer");
  Coupon redeemed = new Coupon(
      alreadyRedeemed: true, hasExpired: false,
      issuedTo: customer, value: 100);

  List<Coupon> validCoupons =
      getValidCoupons([redeemed], customer);

  assertThat(validCoupons).isEmpty();
}

void testGetValidCoupons_expired_excluded() { ... }

void testGetValidCoupons_issuedToDifferentCustomer_excluded() { ... }

void testGetValidCoupons_returnedInDescendingValueOrder() { ... }
