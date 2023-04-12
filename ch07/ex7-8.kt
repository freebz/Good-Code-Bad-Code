// 예제 7.8 생성된 후 수정되는 리스트

...
List<Font> fontFamily = [Font.ARIAL, Font.VERDANA];

TextOptions textoptions =
    new Textoptions(fontFamily, 12.0);

fontFamily.clear();
fontFamily.add(Font.COMIC_SANS);
