// 예제 5.23 값을 제공하는 잘 명명된 함수

class Vehicle {
  ...

  // 차량의 현재 운동에너지를 줄 단위로 반환한다.
  Double getKineticEnergyJ() {
    return 0.5 *
	getMassUsTon() * kilogramsPerUsTon() *
	Math.pow(getSpeedMph() * metersPerSecondPerMph(), 2);
  }

  private static Double kilogramsPerUsTon() {
    return 907.1847;
  }

  private static Double metersPerSecondPerMph() {
    return 0.44704;
  }
}
