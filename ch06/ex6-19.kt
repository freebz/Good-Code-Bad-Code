// 예제 6.19 예상치 못한 부수 효과

class UserDisplay {
  private final Canvas canvas;
  ...

  Color getPixel(Int x, Int y) {
    canvas.redraw();
    PixelData data = canvas.getPixel(x, y);
    return new Color(
	data.getRed(),
	data.getGreen(),
	data.getBlue());
  }
}
