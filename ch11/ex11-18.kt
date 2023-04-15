// 예제 11.18 우편 라벨 코드

class OrderPostagemanager {
  ...

  PostageLabel getPostageLabel(Order order) {
    return new PostageLabel(
	address: order.getCustomer().getAddress(),
	isLargePackage: order.getItems().size() > 2,
    );
  }
}
