// 예제 6.23 입력 매개변수 변경

List<Invoice> getBillableInvoices(
    Map<User, Invoice> userInvoices,
    Set<User> usersWithFreeTrial) {
  userInvoices.removeAll(usersWithFreeTrial);
  return userInvoices.values();
}

void processOrders(OrderBatch orderBatch) {
  Map<User, Invoice> userInvoices =
      orderBatch.getUserInvoices();
  Set<User> usersWithFreeTrial =
      orderBatch.getFreeTrialUsers();

  sendInvoices(
      getBillableInvoices(userInvoices, usersWithFreeTrial));
  enableOrderedServices(userInvoices);
}

void enableOrderedServices(Map<User, Invoice> userInvoices) {
  ...
}
