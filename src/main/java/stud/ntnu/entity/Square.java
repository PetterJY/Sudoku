package stud.ntnu.entity;

/**
 * Represents a square on a sudoku board.
 */
public class Square {
  private int character;

  /**
   * Constructor for the square class.
   */
  public Square() {
    setCharacter('0');
  }

  /**
   * Constructor for the square class.
   *
   * @param character the character to set.
   */
  public Square(int character) {
    setCharacter(character);
  }

  /**
   * Sets the current character to the given parameter.
   *
   * @param character the character to set.
   */
  public void setCharacter(int character) {
    if (character >= 0 && character <= 9) {
      this.character = character;
    } else {
      throw new IllegalArgumentException("Character: " + character + " not in the alphabet.");
    }
  }

  /**
   * Returns the character.
   *
   * @return the character.
   */
  public int getCharacter() {
    return this.character;
  }
}