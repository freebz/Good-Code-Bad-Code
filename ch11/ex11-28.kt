// 예제 11.28 의존성 주입을 하지 않는 클래스

class InvoiceReminder {
  private final AddressBook addressBook;
  private final EmailSender emailSender;

  InvoiceReminder() {
    this.addressBook = DataStore.getAddressBook();
    this.emailSender = new EmailSenderImpl();
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
