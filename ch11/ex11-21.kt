// 예제 11.21 공유 설정의 잘못된 변경

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
	    new Item(name: "Hazardous item", isHazardous: true),
	]);
  }
  ...

  void testGetPostageLabel_threeItems_largePackage() { ... }

  void testGetPostageLabel_hazardousItem_isHazardous() {
    PostageManager postageManager = new PostageManager();

    PostageLabel label =
	postageManager.getPostageLabel(testOrder);

    assertThat(label.isHazardous()).isTrue();
  }
  ...
}
