// 예제 4.7 예외 탐지 및 오류 기록

class InvoiceSender {
  private final EmailService emailService;
  ...

  void emailInvoice(String emailAddress, Invoice invoice) {
    try {
      emailService.sendPlainText(
	  emailAddress,
	  InvoiceFormat.plainText(invoice));
    } catch (EmailException e) {
      logger.logError(e);
    }
  }
}
