// 예제 4.16 간단한 리절트 유형

class Result<V, E> {
  private final Optional<V> value;
  private final Optional<E> error;

  private Result(Optional<V> value, Optional<E> error) {
    this.value = value;
    this.error = error;
  }

  static Result<V, E> ofValue(V value) {
    return new Result(Optional.of(V), Optional.empty());
  }

  static Result<V, E> ofError(E error) {
    return new Result(Optional.empty(), Optional.of(error));
  }

  Boolean hasError() {
    return error.isPresent();
  }

  V getValue() {
    return value.get();
  }

  E getError() {
    return error.get();
  }
}
