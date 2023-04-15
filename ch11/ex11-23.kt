// 예제 11.23 공유 구성의 적절한 사용

class OrderPostageManagerTest {
  private const OrderMetadata ORDER_METADATA =
      new OrderMetadata(
	  timestamp: Instant.ofEpochSecond(0),
	  serverIp: new IpAddress(0, 0, 0, 0));

  void testGetPostageLabel_threeItems_largePackage() { ... }
  void testGetPostageLabel_hazardousItem_isHazardous() { ... }


  void testGetPostageLabel_containsCustomerAddress() {
    Address address = new Address("Test customer address");
    Order order = new Order(
	metadata: ORDER_METADATA,
	customer: new Customer(
	    address: address,
	),
	items: []);

    PostageLabel label = postageManager.getPostageLabel(order);

    assertThat(label.getAddress()).isEqualTo(address);
  }
  ...

  private static Order createOrderWithItems(List<Item> items) {
    return new Order(
	metadata: ORDER_METADATA,
	customer: new Customer(
	    address: new Address("test address"),
	),
	items: items);
  }
}
      
