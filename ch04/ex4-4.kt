// 예약 4.4 빈 목록 반환

class InvoiceManager {
  private final InvoiceStore invoiceStore;
  ...

  List<Invoice> getUnpaidInvoices(Int customerId) {
    InvoiceResult result = invoiceStore.query(customerId);
    if (!result.success()) {
      return [];
    }
    return result
	.getInvoices()
	.filter(invoice -> !invoice.isPaid());
  }
}
