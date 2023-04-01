// 예제 4.6 예외 억제

class InvoiceSender {
  private final EmailService emailService;
  ...

  void emailInvoice(String emailAddress, Invoice invoice) {
    try {
      emailService.sendPlainText(
	  emailAddress,
	  InvoiceFormat.plainText(invoice));
    } catch (EmailException e) { }
  }
}
