// 예제 6.21 편집된 스크린숏 캡처

class UserDisplay {
  private final Canvas canvas;
  ...

  Color getPixel(Int x, Int y) { ... }

  Image captureScreenshot() { ... }

  Image captureRedactedScreenshot() {
    for (Box area in getPrivacySensitiveAreas()) {
      canvas.delete(
	  area.getX(), area.getY(),
	  area.getWidth(), area.getHeight());
    }
    Image screenshot = captureScreenshot();
    canvas.redraw();
    return screenshot;
  }
}
