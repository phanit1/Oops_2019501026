final class Movies {
    /**.
    moviename is the name of the movie in the movies file
    */
    private String movieName;
    /**.
    level is the level of the game to be played
    */
    private String level;
    /**.
    hint1 is for the player to get a hint to
    fill the letter if he feels it difficult
    */
    private String hint1;
    /**.
    hint2 is another hint given to player
    */
    private String hint2;
    Movies(final String m, final String l, final String h1, final String h2) {
        this.movieName = m;
        this.level = l;
        this.hint1 = h1;
        this.hint2 = h2;
    }
    /**.
    getMovieName is used to get the name of the movie
    @return moviename
    */
    public String getMovieName() {
        return this.movieName;
    }
    /**.
    getHint1 is used to get the hint
    @return hint
    */
    public String getHint1() {
        return this.hint1;
    }
    /**.
    getHint2 is used to get the hint
    @return hint
    */
    public String getHint2() {
        return this.hint2;
    }
    /**
     *
     * @param toSet , to use
     */
    public void setMovieName(final String toSet) {
        this.movieName = toSet;
    }
    /**
     *
     * @param toSet , to use
     */
    public void setLevel(final String toSet) {
        this.level = toSet;
    }
    /**
     *
     * @param toSet , to use
     */
    public void setHint1(final String toSet) {
        this.hint1 = toSet;
    }
    /**
     *
     * @param toSet , to use
     */
    public void setHint2(final String toSet) {
        this.hint2 = toSet;
    }
}
