// 예제 5.29 긴 익명 함수

void displayFeedback(List<Feedback> allFeedback) {
  ui.getFeedbackWidget().setItems(
      buildFeedbackListItems(allFeedback));
}

private List<ListItem> buildFeedbackListItems(
    List<Feedback> allFeedback) {
  return allFeedback.map(feedback ->
    new ListItem(
      title: new TextBox(
	text: feedback.getTitle(),
	options: new TextOptions(weight: TextWeight.BOLD),
      ),
      body: new Column(
	children: [
	  new TextBox(
	    text: feedback.getComment(),
	    border: new Border(style: BorderStyle.DASHED),
	  ),
	  new Row(
	    children: feedback.getCategories().map(category ->
              new TextBox(
		text: category.getLabel(),
		options: new TextOptions(style: TextStyle.ITALIC),
	      ),
	    ),
	  ),
	],
      ),
    )
  );
}
