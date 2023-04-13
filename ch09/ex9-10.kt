// 예제 9.10 의존성 주입된 ShoppingBasket

class ViewItemWidget {
  private final Item item;
  private final ShoppingBasket basket;

  ViewItemWidget(Item item, ShoppingBasket basket) {
    this.item = item;
    this.basket = basket;
  }
  ...

  void addItemToBasket() {
    basket.addItem(item);
  }
}

class ViewItemWidget {
  private final ShoppingBasket basket;

  ViewItemWidget(ShoppingBasket basket) {
    this.basket = basket;
  }
  
  void displayItems() {
    List<Item> items = basket.getItems();
    ...
  }
}
