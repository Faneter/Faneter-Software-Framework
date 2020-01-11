package pers.faneter.framework.mvc.controller;

import pers.faneter.framework.mvc.model.Model;
import pers.faneter.framework.mvc.view.View;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class Controller<M extends Model, V extends View> implements ControllerInterface {
  protected M model;
  protected V view;

  public Controller(M model, V view) {
    this.model = model;
    this.view = view;
    model.addObserver(view);
    model.notifyAllObservers();
  }
}
