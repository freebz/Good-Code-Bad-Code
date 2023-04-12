// 예제 8.29 계층에 적합한 예외 처리

void updateTextSummary(UserInterface ui) {
  String userText = ui.getUserText();
  try {
    String summary = textSummarizer.summarizeText(userText);
    ui.getSummaryField().setValue(summary);
  } catch (TextSummarizerException e) {
    ui.getSummaryField().setError("Unable to summarize text");
  }
}
