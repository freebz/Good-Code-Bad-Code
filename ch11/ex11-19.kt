// 예제 11.19 테스트 설정 공유

class OrderPostageManagerTest {
  private Order testOrder;

  @BeforeEach
  void setUp() {
    testOrder = new Order(
	customer: new Customer(
	    address: new Address("Test address"),
	),
	items: [
	    new Item(name: "Test item 1"),
	    new Item(name: "Test item 2"),
	    new Item(name: "Test item 3"),
	]);
  }
  ...

  void testGetPostageLabel_threeItems_largePackage() {
    PostageManager postageManager = new PostageManager();

    PostageLabel label =
	postageManager.getPostageLabel(testOrder);

    assertThat(label.isLargePackage()).isTrue();
  }
  ...
}
