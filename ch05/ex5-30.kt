// 예제 5.30 더 작은 명명 함수

void displayFeedback(List<Feedback> allFeedback) {
  ui.getFeedbackWidget().setItems(
      buildFeedbackListItems(allFeedback));
}

private List<ListItem> buildFeedbackListItems(
    List<Feedback> allFeedback) {
  return allFeedback.map(buildFeedbackItem);
}

private ListItem buildFeedbackItem(Feedback feedback) {
  return new ListItem(
    title: buildTitle(feedback.getTitle()),
    body: new Column(
      children: [
	buildCommentText(feedback.getComment()),
	buildCategories(feedback.getCategories()),
      ],
    ),
  );
}

private TextBox buildTitle(String title) {
  return new TextBox(
    text: feedback.getTitle(),
    options: new TextOptions(weight: TextWeight.BOLD),
  );
}

private TextBox buildCommentText(String comment) {
  return new TextBox(
    text: comment,
    border: new Border(style: BorderStyle.DASHED),
  );
}

private Row buildCategories(List<Category> categories) {
  return new Row(
    children: categories.map(buildCategory),
  );
}

private TextBox buildCategory(Category category) {
  return new TextBox(
    text: category.getLabel(),
    options: new TextOptions(style: TextStyle.ITALIC),
  );
}
