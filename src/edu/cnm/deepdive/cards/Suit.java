package edu.cnm.deepdive.cards;

public enum Suit {
  CLUBS, DIAMONDS, HEARTS, SPADES; // must add that semicolon, could be on test to recognize that it needs to be added.

  @Override
  public String toString() {
    switch (this) {
      case CLUBS:
        return "\u2663";
      case DIAMONDS:
        return "\u2666";
      case HEARTS:
        return "\u2665";
      case SPADES:
        return "\u2660";
      default:
        return""; //guarantees that there's no way to go through this code w/o a "return"
    }
  }
}
