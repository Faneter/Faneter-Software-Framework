package pers.faneter.framework.plugin;

import java.util.HashSet;
import java.util.Set;

public abstract class PluginLoader {
  protected Set<Plugin> plugins = new HashSet<>();

  public PluginLoader() {
    PluginManager.addPluginLoader(getDescription(), this);
  }

  void add(Plugin plugin) {
    plugins.add(plugin);
    addPlugin(plugin);
  }

  public abstract void addPlugin(Plugin plugin);

  public abstract String getDescription();
}
