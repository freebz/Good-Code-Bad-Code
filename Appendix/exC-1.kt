// 예제 C.1 Builder 패턴 구현

public final class TextOptions {
  private final Font font;
  private final OptionalDouble fontSize;
  private final Optional<Color> color;

  private TextOptions(Builder builder) {
    font = builder.font;
    fontSize = builder.fontSize;
    color = builder.color;
  }

  public Font getFont() {
    return font;
  }

  public OptionalDouble getFontSize() {
    return fontSize;
  }

  public Optional<Color> getColor() {
    return color;
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static final class Builder {
    private Font font;
    private OptionalDouble fontSize = OptionalDouble.empty();
    private Optional<Color> color = Optional.empty();

    public Builder(Font font) {
      this.font = font;
    }

    private Builder(TextOptions options) {
      font = options.font;
      fontSize = options.fontSize;
      color = options.color;
    }

    public Builder setFont(Font font) {
      this.font = font;
      return this;
    }

    public Builder setFontSize(double fontSize) {
      this.fontSize = OptionalDouble.of(fontSize);
      return this;
    }

    public Builder clearFontSize() {
      fontSize = OptionalDouble.empty();
      return this;
    }

    public Builder clearColor() {
      color = Optional.empty();
      return this;
    }

    public TextOptions build() {
      return new TextOptions(this);
    }
  }
}
