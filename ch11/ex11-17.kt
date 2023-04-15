// 예제 11.17 테스트 케이스 간 상태 초기화

class OrderManagerTest {

  private Database database;

  @BeforeAll
  void oneTimeSetUp() {
    database = Database.createInstance();
    database.waitForReady();
  }

  @AfterEach
  void tearDown() {
    database.reset();
  }

  void testProcessOrder_outOfStockItem_orderDelayed() { ... }

  void testProcessOrder_paymentNotComplete_orderDelayed() { ... }
  ...
}
