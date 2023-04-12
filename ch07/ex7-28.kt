// 예제 7.28 DataLogger 및 DataLoader

class DataLogger {
  private final List<Int> loggedValues;
  private final IntListFormat intListFormat;
  ...
  saveValues(FileHandler file) {
    file.write(intListFormat.serialize(loggedValues));
  }
}

...

class DataLoader {
  private final IntListFormat intListFormat;
  ...
  List<Int> loadValues(FileHandler file) {
    return intListFormat.deserialize(file.readAsString());
  }
}
