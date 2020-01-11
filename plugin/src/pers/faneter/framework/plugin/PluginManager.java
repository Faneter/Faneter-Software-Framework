package pers.faneter.framework.plugin;

import java.util.*;

public final class PluginManager {
  private static Map<String, PluginLoader> loaders = new HashMap<>();

  private static List<Plugin> holdPlugins = new ArrayList<>();

  public static void addPluginLoader(String description, PluginLoader loader) {
    loaders.put(description, loader);
  }

  public static void loadPlugin(Plugin plugin) {
    PluginLoader loader = loaders.get(plugin.getDescription());
    if (loader != null) {
      loader.add(plugin);
    } else {
      holdPlugins.add(plugin);
    }
  }

  public static void loadHoldPlugins() {
    Iterator<Plugin> iterator = holdPlugins.iterator();
    while (iterator.hasNext()) {
      Plugin plugin = iterator.next();
      holdPlugins.remove(plugin);
      loadPlugin(plugin);
    }
  }
}
