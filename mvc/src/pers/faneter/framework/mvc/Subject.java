package pers.faneter.framework.mvc;

public interface Subject<O extends Observer> {
  void addObserver(O observer);
  void removeObserver(O observer);
  void notifyAllObservers();
}
