package pers.faneter.framework.mvc.model;

import pers.faneter.framework.mvc.Observer;
import pers.faneter.framework.mvc.Subject;

public interface ModelInterface<O extends Observer> extends Subject<O> {
  @Override
  void addObserver(O observer);

  @Override
  void removeObserver(O observer);

  @Override
  void notifyAllObservers();
}
