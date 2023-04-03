// 예제 5.21 Vehicle 클래스

class Vehicle {
  ...

  Double getMassUsTon() { ... }

  Double getSpeedMph() { ... }

  // 차량의 현재 운동에너지를 줄 단위로 변환한다.
  Double getKineticEnergyJ() {
    return 0.5 *
	getMassUsTon() * 907.1847 *
	Math.pow(getSpeedMph() * 0.44704, 2);
  }
}
