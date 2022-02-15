package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

  private final List<Card> cards;

  public Deck() {
    cards = new ArrayList<>();
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        Card c = new Card(s, r);
        cards.add(c);
      }
    }
  }

  @Override
  public String toString() {
    return cards.toString();
  }

  public void shuffle(Random rng) {
    Collections.shuffle(cards, rng);
  }

  public void shuffle() {
    shuffle(new Random());

  }
  public void sort() {
    Collections.sort(cards);
  }
}


