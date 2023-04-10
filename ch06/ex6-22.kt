// 예제 6.22 더 많은 정보를 제공하는 이름

class UserDisplay {
  private final Canvas canvas;
  ...

  Color redrawAndGetPixel(Int x, Int y) {
    canvas.redraw();
    PixelData data = canvas.getPixel(x, y);
    return new Color(
	data.getRed(),
	data.getGreen(),
	data.getBlue());
  }
}
