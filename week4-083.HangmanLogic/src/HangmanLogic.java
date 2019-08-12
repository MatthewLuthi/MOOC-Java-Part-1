
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;
    private String letterGuess;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    /**
     * Functionality for making a guess
     * If a letter has already been guessed nothing happens
     * If the word does not contain the guessed letter, number of faults increase
     * The letter is added among the already guessed letters
     * @param letter 
     */
    public void guessLetter(String letter) {
        if (!guessedLetters.contains(letter)) {
            if (word.contains(letter)) {
                guessedLetters += letter;
            } else {
                numberOfFaults++;
                guessedLetters += letter;
            }
        } 
        letterGuess = letter;
    }

    /**
     * Functionality for building the hidden word
     * Create the hidden word by interacting through this.word letter by letter
     * If the letter in turn is within the guessed words, put it in the hidden word
     * If the letter is not among guessed, replace it with _ in the hidden word
     * @return the hidden word at the end
     */
    public String hiddenWord() {
        String wordNow = "";
        boolean letterMatched = false;
        //Iterate over hidden word
        for (int i = 0; i < word.length(); i++) {
            letterMatched = false;//Always assume letterMatched is false, so we can change to true if required
            //Now iterate over guessed letters to check each letter against current word character
            for (int k = 0; k < guessedLetters.length(); k++) {
                if (guessedLetters.charAt(k) == word.charAt(i)) {
                    wordNow += word.charAt(i);
                    letterMatched = true;
                } 
            }
            if (!letterMatched) {
                wordNow += "_";
            }
        }
        
        return wordNow;
        //return "";
    }
}
