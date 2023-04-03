// 예제 5.1 서술적이지 않은 이름

class T {
  Set<String> pns = new Set();
  Int s = 0;
  ...
  Boolean f(String n) {
    return pns.contains(n);
  }

  Int getS() {
    return s;
  }
}

Int? s(List<T> ts, String n) {
  for (T t in ts) {
    if (t.f(n)) {
      return t.getS();
    }
  }
  return null;
}
