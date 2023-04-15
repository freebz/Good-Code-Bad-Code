// 예제 11.11 유효한 쿠폰을 추려내기 위한 코드

List<Coupon> getValidCoupons(
    List<Coupon> coupons, Customer customer) {
  return coupons
      .filter(coupon -> !coupon.alreadyRedeemd())
      .filter(coupon -> !coupon.hasExpired())
      .filter(coupon -> coupon.issuedTo() == customer)
      .sortBy(coupon -> coupon.getValue(), SortOrder.DESCENDING);
}
