// 예제 4.1 전화 번호 분석

class PhoneNumber {
  ...
  static PhoneNumber parse(String number) {
    if (!isValidPhoneNumber(number)) {
      ... 에러를 처리하기 위한 코드 ...
    }
    ...
  }
  ...
}