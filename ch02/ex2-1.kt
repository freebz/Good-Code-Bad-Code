// 예제 2.1 서버에 메시지 보내기

HttpConnection connection =
    HttpConnection.connect("http://example.com/server");
connection.send("Hello server");
connection.close();
