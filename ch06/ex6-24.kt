// 예제 6.24 입력 매개변수를 변경하지 않음

List<Invoice> getBillableInvoices(
    Map<User, Invoice> userInvoices,
    Set<User> usersWithFreeTrial) {
  return userInvoices
      .entries()
      .filter(entry ->
	  !usersWithFreeTrial.contains(entry.getKey()))
      .map(entry -> entry.getValue());
}
