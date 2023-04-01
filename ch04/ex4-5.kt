// 예제 4.5 오류 발생 시 아무것도 하지 않음

class MutableInvoice {
  ...
  void addItem(InvoiceItem item) {
    if (item.getPrice().getCurrency() !=
	    this.getCurrency()) {
      return;
    }
    this.items.add(item);
  }
  ...
}
