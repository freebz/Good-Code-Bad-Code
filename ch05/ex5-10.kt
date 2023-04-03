// 예제 5.10 코드의 양은 더 많지만 가독성은 높은 코드

Boolean isIdValid(UInt16 id) {
  return extractEncodedParity(id) ==
      calculateParity(getIdValue(id));
}

private const UInt16 PARITY_BIT_INDEX = 15;
private const UInt16 PARITY_BIT_MASK = (1 << PARITY_BIT_INDEX);
private const UInt16 VALUE_BIT_MASK = ~PARITY_BIT_MASK;

private UInt16 getIdValue(UInt16 id) {
  return id & VALUE_BIT_MASK;
}

private UInt16 extractEncodedParity(UInt16 id) {
  return (id & PARITY_BIT_MASK) >> PARITY_BIT_INDEX;
}

// 패리티 비트는 1인 비트의 수가 짝수이면 0이고
// 홀수이면 1이다.
private UInt16 calculateParity(UInt16 value) {
  return countSetBits(value) % 2;
}
