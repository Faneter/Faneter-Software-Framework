package pers.faneter.framework.file.controller;

import lombok.Getter;
import pers.faneter.framework.file.model.Model;
import pers.faneter.framework.file.view.View;

@Getter
public abstract class Controller {
  protected Model model;
  protected View view;

  public Controller(Model model, View view) {
    this.model = model;
    this.view = view;
  }
}
