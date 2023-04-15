// 예제 11.16 테스트 케이스 간 상태 공유

class OrderManagerTest {

  private Database database;

  @BeforeAll
  void oneTimeSetUp() {
    database = Database.createInstance();
    database.waitForReady();
  }

  void testProcessOrder_outOfStockItem_orderDelayed() {
    Int orderId = 12345;
    Order order = new Order(
	orderId: orderId,
	containsOutOfStockItem: true,
	isPaymentComplete: true);
    OrderManager orderManager = new OrderManager(database);

    orderManager.processOrder(order);

    assertThat(database.getOrderStatus(orderId))
	.isEqualTo(OrderStatus.DELAYED);
  }

  void testProcessOrder_paymentNotComplete_orderDelayed() {
    Int orderId = 12345;
    Order order = new Order(
	orderId: orderId,
	containsOutOfStockItem: false,
	isPaymentComplete: false);
    OrderManager orderManager = new OrderManager(database);

    orderManager.processOrder(order);

    assertThat(database.getOrderStatus(orderId))
	.isEqualTo(OrderStatus.DELAYED);
  }
  ...
}
