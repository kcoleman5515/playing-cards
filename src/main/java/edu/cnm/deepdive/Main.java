package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    Deck d = new Deck();
    System.out.println(d);
    d.shuffle();
    for (Card c : d) {
      System.out.println(c);
    }
    System.out.println(d);
    d.sort();
  }

}
