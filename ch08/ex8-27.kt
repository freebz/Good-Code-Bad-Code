// 예제 8.27 특정 구현에 종속된 예외 처리

void updateTextSummary(UserInterface ui) {
  String userText = ui.getUserText();
  try {
    String summary = textSummarizer.summarizeText(userText);
    ui.getSummaryField().setValue(summary);
  } catch (PredictionModelException e) {
    ui.getSummaryField().setError("Unable to summarize text");
  }
}
