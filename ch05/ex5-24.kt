// 예제 5.24 변환을 수행하기 위한 헬퍼 함수

class Vehicle {
  ...
  // 차량의 현재 운동에너지를 줄 단위로 반환한다.
  Double getKineticEnergyJ() {
    return 0.5 *
	usTonsToKilograms(getMassUsTon()) *
	Math.pow(mphToMetersPerSecond(getSpeedMgh()), 2);
  }

  private static Double usTonsToKilograms(Double usTons) {
    return usTons * 907.1847;
  }

  private static Double mphToMetersPerSecond(Double mph) {
    return mph * 0.44704;
  }
}
