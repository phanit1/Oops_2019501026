public class Game {
public void chooselevel() {
    String level = "";
    int noOfGuesses = 0;
    int levelNumber = 0;
    switch(levelNumber) {
        case 1: level = "Easy";
                noOfGuesses = 10;
        break;
        case 2: level = "Medium";
                noOfGuesses = 15;
        break;
        case 3: level = "Hard";
                noOfGuesses = 25;
        break;
        default: level = "Default Level by computer";
                noOfGuesses = 20;
        break;
    }
}
public void chooseMovieName() {
     
}
public void showAvailableLetters() {
    String letters = "abcdefghijklmnopqrstuvwxyz";

}
public String guessCharacters() {
    String guess = "";
    return guess;
}
public void isWordCorrect() {

}
public void updatingCharacterts() {

}

}