// 예제 6.20 스크린숏 캡처

class UserDisplay {
  private final Canvas canvas;
  ...
  Color getPixel(Int x, Int y) { ... }
  ...

  Image captureScreenshot() {
    Image image = new Image(
	canvas.getWidth(), canvas.getHeight());
    for (Int x = 0; x < image.getWidth(); ++x) {
      for (Int y = 0; y < image.getHeight(); ++y) {
	image.setPixel(x, y, getPixel(x, y));
      }
    }
    return image;
  }
}
