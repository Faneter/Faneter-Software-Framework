package pers.faneter.framework.mvc.model;

import pers.faneter.framework.mvc.view.View;

import java.util.HashSet;
import java.util.Set;

public abstract class Model<O extends View> implements ModelInterface<O> {
  private Set<O> set = new HashSet<O>();

  @Override
  public void addObserver(O observer) {
    set.add(observer);
  }

  @Override
  public void removeObserver(O observer) {
    set.remove(observer);
  }

  @Override
  public void notifyAllObservers() {
    for (O o : set) {
      o.update(this);
    }
  }
}
