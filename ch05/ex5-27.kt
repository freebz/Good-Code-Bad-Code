// 예제 5.27 의미가 자명하지 않은 익명 함수

List<UInt16> getValidIds(List<UInt16> ids) {
  return ids
      .filter(id -> id != 0)
      .filter(id -> countSetBits(id & 0x7FFF) % 2 ==
		  ((id & 0x8000) >> 15));
}
