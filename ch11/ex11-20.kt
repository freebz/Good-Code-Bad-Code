// 예제 11.20 새로운 기능

class PostageManager {
  ...

  PostageLabel getPostageLabel(Order order) {
    return new PostageLabel(
	address: order.getCustomer().getAddress(),
	isLargePackage: order.getItems().size() > 2,
	isHazardous: containsHazardousItem(order.getItems()));
  }

  private static Boolean containsHazardousItem(List<Item> items) {
    return items.anyMatch(item -> item.isHazardous());
  }
}
