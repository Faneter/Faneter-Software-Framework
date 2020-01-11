package pers.faneter.framework.mvc.view;

import pers.faneter.framework.mvc.Observer;
import pers.faneter.framework.mvc.Subject;

public interface ViewInterface<S extends Subject> extends Observer<S> {
  void update(S subject);
}
