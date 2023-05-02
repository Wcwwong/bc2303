package week3.Classes.game;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import week3.Classes.game.enums.CardNumber;
import week3.Classes.game.enums.CardSuit;

public class Deck {
  
  List<Card> cards; // object reference

  public Deck(){
    cards = new ArrayList<>();
    // add 54 (52+2) cards into the deck
    for (CardNumber number: CardNumber.values()){// 15-> Ace
      if(number == CardNumber.BLACK_JOKER || number == CardNumber.RED_JOKER){
        cards.add(new Card(number, CardSuit.DEFAULT));
        continue; // skip the if above
      }
        // add to list
         continue;
      for(CardSuit suit: CardSuit.values()){ //4, Ace-> 4 times
       if (suit!= CardSuit.DEFAULT){
        cards.add(new Card(number, suit));
       }
      }

    }

    public boolean removeJokers(){
      List<Card> removeList = new ArrayList<>();// some basic algo can remember
      // remove
      for(Card card:this.cards){
        if(card.getNumber() == CardNumber.RED_JOKER//
        || card.getNumber() == CardNumber.BLACK_JOKER){
          removeList.add(card);
        }

      }
     // remove all jokers
     return this.cards.removeAll(removeList);

    }



  
      
      //10 times shuffling random 2 indices

      //tips: array
      //ArayList to Array
      //shuffle
      //Array to ArrayList
    }

    public void withdraw(int numberOfCard){
      // get random number (0-53)
       for (int i=0; i<numberOfCard;i++){
         int number =50;
           this.cards.remove(number);
    }

    } 
    
    @Override
    public String toString(){
      String result = "";
      for(Card s: this.cards){
        result+= String.format("[CardNumber:%s, CardSuit:%s]", s.number, s.suit);
        result+="\n";
      }
      return result;
    }
    
    // add card
  }

  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(deck.toString());
    // deck -> 54 cards
  }
}
