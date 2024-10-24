package stud.ntnu.entity;

/**
 * Represents a square on a sudoku board.
 */
public class Square {
  private char[] alphabet;
  private char character;

  /**
   * Constructor for the square class.
   */
  public Square() {
    this.alphabet = "0123456789".toCharArray();
    setCharacter('*');
  }

  /**
   * Constructor for the square class.
   *
   * @param character the character to set.
   */
  public Square(char character) {
    this.alphabet = "*0123456789".toCharArray();
    setCharacter(character);
  }

  /**
   * Returns true if the alphabet contains the character given.
   *
   * @param character the character to check.
   * @return true if the alphabet contains the character given.
   */
  public boolean contains(char character) {
    for (int i = 0; i < alphabet.length - 1; i++) {
      if (alphabet[i] == character) {
        return true;
      }
    }
    return false;
  }

  /**
   * Sets the current character to the given parameter.
   *
   * @param character the character to set.
   */
  public void setCharacter(char character) {
    if (contains(character)) {
      this.character = character;
    } else {
      throw new IllegalArgumentException("Character not in the alphabet.");
    }
  }

  /**
   * Returns the alphabet.
   *
   * @return the alphabet.
   */
  public
  char[] getAlphabet() {
    return this.alphabet;
  }

  /**
   * Returns the character.
   *
   * @return the character.
   */
  public char getCharacter() {
    return this.character;
  }
}