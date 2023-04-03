// 예제 5.3 서술적인 이름

class Team {
  Set<String> playerNames = new Set();
  Int score = 0;
  ...
  Boolean containsPlayer(String playerName) {
    return playerNames.contains(playerName);
  }

  Int getScore() {
    return score;
  }
}

Int? getTeamScoreForPlayer(List<Team> teams, String playerName) {
  for (Team team in teams) {
    if (team.containsPlayer(playerName)) {
      return team.getScore();
    }
  }
  return null;
}
