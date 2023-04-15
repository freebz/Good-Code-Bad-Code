// 예제 11.22 테스트 케이스 내에서 이루어지는 중요한 설정

class OrderPostageManagerTest {
  ...

  void testGetPostageLabel_threeItems_largePackage() {
    Order order = createOrderWithItems([
      new Item(name: "Test item 1"),
      new Item(name: "Test item 2"),
      new Item(name: "Test item 3"),
    ]);
    PostageManager postageManager = new PostageManager();

    PostageLabel label = postageManager.getPostageLabel(order);

    assertThat(label.isLargePackage()).isTrue();
  }

  void testGetPostageLabel_hazardousItem_isHazardous() {
    Order order = createOrderWithItems([
      new Item(name: "Hazardous item", isHazardous: true),
    ]);
    PostageManager postageManager = new PostageManager();

    PostagelLabel label = postageManager.getPostageLabel(order);

    assertThat(label.isHazardous()).isTrue();
  }
  ...

  private static Order createOrderWithItems(List<Item> items) {
    return new Order(
	customer: new Customer(
	    address: new Address("Test address"),
	),
	items: items);
  }
}
