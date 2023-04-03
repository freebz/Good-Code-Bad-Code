// 예제 5.22 잘 명명된 상수

class Vehicle {
  private const Double KILOGRAMS_PER_US_TON = 907.1847;
  private const Double METERS_PER_SECOND_PER_MPH = 0.44704;
  ...

  // 차량의 현재 운동에너지를 줄 단위로 반환한다.
  Double getKineticEnergyJ() {
    return 0.5 *
	getMassUsTon() * KILOGRAMS_PER_US_TON *
	Math.pow(getSpeedMph() * METERS_PER_SECOND_PER_MPH, 2);
  }
}
