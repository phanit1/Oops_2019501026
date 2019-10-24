class Player{
    private String pname;
    private String level;
    private int score;
    Player(final String n, String l, int s){
        this.pname = n;
        this.level = l;
        this.score = s;
    }
    public String toString() {
        return "Player Name: "+this.pname+" played "+this.level+" and scored "+this.score+" points.";
    }
    public String getPlayerName() {
        return this.pname;
    }
    public String getLevel() {
        return this.level;
    }
    public int getScore() {
        return this.score;
    }
    public void setPlayerName(final String toSet) {
        this.pname = toSet;
    }
    public void setLevel(final String toSet) {
        this.level = toSet;
    }
    public void setScore(final int toSet) {
        this.score = toSet;
    }
}