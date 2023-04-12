// 예제 7.9 호출하는 쪽에 의해 수정된 리스트

...
TextOptions textoptions =
    DSnew Textoptions([Font.ARIAL, Font.VERDANA], 12.0);

List<Font> fontFamily = Textoptions.getFontFamily();
fontFamily.clear();
fontFamily.add(Font.COMIC_SANS);
