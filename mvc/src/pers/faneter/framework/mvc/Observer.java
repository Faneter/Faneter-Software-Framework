package pers.faneter.framework.mvc;

public interface Observer<S extends Subject> {
  void update(S subject);
}
