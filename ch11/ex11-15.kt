// 예제 11.15 데이터베이스에 쓰기 동작을 수행하는 코드

class OrderManager {
  private final Database database;

  void processOrder(Order order) {
    if (order.containsOutOfStockItem() ||
	!order.isPaymentComplete()) {
      database.setOrderStatus(
	  order.getId(), OrderStatus.DELAYED);
    }
    .
  }
}
