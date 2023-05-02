package week3.Classes.game;

import week3.Classes.game.enums.CardNumber;
import week3.Classes.game.enums.CardSuit;

public class Card {
  CardSuit suit;
  CardNumber number;

  public Card(CardNumber number, CardSuit suit){
    this.number = number;
    this.suit = suit;
  }

  public CardNumber getNumber() {
    return number;
  }
  public CardSuit getSuit() {
    return suit;
  }

  public void immutable (){
    String a ="hello";
    String b = "hello";
    // only one object in heap -> "hello"
    // two object references, a, b 

    a="bye";
    b="bye";
    // heap: "hello", "bye"
    // two object references, a, b 
  }
}
