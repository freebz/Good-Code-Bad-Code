// 예제 4.28 오류가 없는 초기 코드

class TemperatureLogger {
  private final Thermometer thermometer;
  private final DataLogger dataLogger;
  ...

  void logCurrentTemperature() {
    dataLogger.logDataPoint(
	Instant.now(),
	thermometer.getTemperature());
  }
}

class DataLogger {
  private final InMemoryDataStore dataStore;
  ...

  void logDataPoint(Instant time, Double value) {
    dataStore.store(new DataPoint(time.toMillis(), value));
  }
}
