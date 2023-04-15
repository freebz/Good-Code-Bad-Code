// 예제 11.29 의존성 주입을 사용한 클래스

class InvoiceReminder {
  private final AddressBook addressBook;
  private final EmailSender emailSender;

  InvoiceReminder(
      AddreddBook addressBook,
      EmailSender emailSender) {
    this.addressBook = addressBook;
    this.emailSender = emailSender;
  }

  static InvoiceReminder create() {
    return new InvoiceReminder(
	DataSource.getAddressBook(),
	new EmailSenderImpl());
  }

  @CheckReturnValue
  Boolean sendReminder(Invoice invoice) {
    EmailAddress? address =
	addressBook.lookupEmailAddress(invoice.getCustomerId());
    if (address == null) {
      return false;
    }
    return emailSender.send(
	address,
	InvoiceReminderTemplate.generate(invoice));
  }
}
