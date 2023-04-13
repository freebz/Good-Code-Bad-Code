// 예제 9.9 수정된 ShoppingBasket 클래스

class ShoppingBasket {
  private final List<Item> items = [];

  void addItem(Item item) {
    items.add(item);
  }

  List<Item> getItems() {
    return List.copyOf(items);
  }
}
