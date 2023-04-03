// 예제 5.9 간결하지만 이해하기 어려운 코드

Boolean isIdValid(UInt16 id) {
  return countSetBits(id & 0x7FFF) % 2 == ((id & 0x8000) >> 15);
}
