package edu.cnm.deepdive.cards;

import java.util.Comparator;

public class Test {

  public static void main(String[] args) {
    // This is now a local class below
//    class AlternateSorter implements Comparator<Card> { // package private class. only one "public class" in a .java file
//      // if you don't define a constructor, Java will define a default constructor
//      @Override
//      public int compare(Card card1, Card card2) {
//        if (card1.rank != card2.rank) {
//          return card1.rank.compareTo(card2.rank);
//
//        }
//        return card1.suit.compareTo(card2.suit);
//      }
//
//    }


    Deck deck = new Deck();
    deck.shuffle();
    System.out.println(deck);
    deck.sort();
    System.out.println(deck);

    // Anonymous class
//    deck.sort(new Comparator<Card>() {
//      @Override
//      public int compare(Card card1, Card card2) {
//        if (card1.rank != card2.rank) {
//          return card1.rank.compareTo(card2.rank);
//        }
//      return card1.suit.compareTo(card2.suit);
//      }
//    }); // to create instance use "new"

    // Lambda expression, with explicit body and return
//    deck.sort((card1, card2) -> {
//        if (card1.rank != card2.rank) {
//          return card1.rank.compareTo(card2.rank);
//        }
//        return card1.suit.compareTo(card2.suit);
//    });
//    System.out.println(deck);
//
//  }
    // Lambda expression, with implicit body and return
    deck.sort((card1, card2) -> (card1.rank != card2.rank)
          ? card1.rank.compareTo(card2.rank)
          : card1.suit.compareTo(card2.suit));
    System.out.println(deck);
  }


  // Nested class
//  private static class AlternateSorter implements Comparator<Card> { // package private class. only one "public class" in a .java file
//    // if you don't define a constructor, Java will define a default constructor
//    @Override
//    public int compare(Card card1, Card card2) {
//      if (card1.rank != card2.rank) {
//        return card1.rank.compareTo(card2.rank);
//
//      }
//      return card1.suit.compareTo(card2.suit);
//    }
//
//  }
//
}

// Top-level (non-public) class
//class AlternateSorter implements Comparator<Card> { // package private class. only one "public class" in a .java file
//  // if you don't define a constructor, Java will define a default constructor
//  @Override
//  public int compare(Card card1, Card card2) {
//    if (card1.rank != card2.rank) {
//      return card1.rank.compareTo(card2.rank);
//
//    }
//    return card1.suit.compareTo(card2.suit);
//  }
