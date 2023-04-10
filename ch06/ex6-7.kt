// 예제 6.7 최대최소 알고리즘

class GameLevel {
  ...
  List<Int> getAllScores() { ... }
}

GameLevel? getEasiestLevel(List<GameLevel> levels) {
  GameLevel? easiestLevel = null;
  Int? highestMinScore = null;
  for (GameLevel level in levels) {
    Int minScore = minValue(level.getAllScores());
    if (highestMinScore == null || minScore > highestMinScore) {
      easiestLevel = level;
      highestMinScore = minScore;
    }
  }
  return easiestLevel;
}
