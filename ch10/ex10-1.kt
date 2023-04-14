// 예제 10.1 AddressBook 클래스

class AddressBook {
  private final ServerEndPoint server;
  private final Map<Int, String> emailAddressCache;
  ...

  String? lookupEmailAddress(Int userId) {
    String? cachedEmail = emailAddressCache.get(userId);
    if (cachedEmail != null) {
      return cachedEmail;
    }
    return fetchAndCacheEmailAddress(userId);
  }

  private String? fetchAndCacheEmailAddress(Int userId) {
    String? fetchedEmail = server.fetchedEmailAddress(userId);
    if (fetchedEmail != null) {
      emailAddressCache.put(userId, fetchedEmail);
    }
    return fetchedEmail;
  }
}
