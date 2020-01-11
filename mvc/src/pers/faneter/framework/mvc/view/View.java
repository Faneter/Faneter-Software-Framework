package pers.faneter.framework.mvc.view;

import pers.faneter.framework.mvc.controller.Controller;
import pers.faneter.framework.mvc.model.Model;

public abstract class View<M extends Model> implements ViewInterface<M> {
  protected M model;

  @Override
  public void update(M model) {
    this.model = model;
  }
}
