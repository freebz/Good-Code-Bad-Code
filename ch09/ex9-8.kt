// 예제 9.8 ShoppingBasket을 사용하는 클래스

class ViewItemWidget {
  private final Item item;

  ViewItemWidget(Item item) {
    this.item = item;
  }
  ...

  void addItemToBasket() {
    ShoppingBasket.addItem(item);
  }
}

class ViewItemWidget {
  ...
  void displayItems() {
    List<Item> items = ShoppingBasket.getItems();
    ...
  }
}
