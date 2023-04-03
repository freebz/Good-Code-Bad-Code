// 예제 5.33 스트림을 사용하여 맵에서 값을 얻기

Optional<String> value = map
    .entrySet()
    .stream()
    .filter(entry -> entry.getKey().equals(key))
    .map(Entry::getValue)
    .findFirst();
