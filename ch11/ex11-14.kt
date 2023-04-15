// 예제 11.14 매개변수를 사용한 테스트

[TestCase(true, false, TestName = "이미 사용함")]
[TestCase(false, true, TestName = "유효기간 만료")]
void testGetValidCoupons_excludesInvalidCoupons(
    Boolean alreadyRedeemed, Boolean hasExpired) {
  Customer customer = new Customer("test customer");
  Coupon coupon = new Coupon(
      alreadyRedeemed: alreadyRedeemed,
      hasExpired: hasExpired,
      issuedTo: customer, value: 100);

  List<Coupon> validCoupons =
      getValidCoupons([coupon], customer);

  assertThat(validCoupons).isEmpty();
}
