package week3.interfaces;

import week3.Classes.Direction;

public interface Spinable {
  
  boolean start();

  boolean stop();

  void changeDirection(Direction direction);

  void accelerate(int speed);
}
