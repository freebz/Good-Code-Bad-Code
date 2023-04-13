// 예제 9.7 ShoppingBasket 클래스

class ShoppingBasket {
  private static List<Item> items = [];

  static void addItem(Item item) {
    items.add(item);
  }

  static List<Item> getItems() {
    return List.copyOf(items);
  }
}
