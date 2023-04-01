// 예제 4.29 검사 예외 숨기기

class DataLogger {
  private final DiskDataStore dataStore;
  ...

  void logDataPoint(Instant time, Double value) {
    try {
      dataStore.store(new DataPoint(time.toMillis(), value));
    } catch (IOException e) {}
  }
}
