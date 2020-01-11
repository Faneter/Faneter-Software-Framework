package pers.faneter.framework.plugin.util;

/**
 * 在构建jar包时，plugin文件的格式如下<br>
 * description-file: // 你所提供的PluginDescription的全名(即包括包名)<br>
 * plugin-name:      // 你的插件的名称<br>
 * plugin-id：       // 你的插件ID(唯一)
 */
public abstract class PluginDescription {
  public abstract void createPlugin();

  public void createPluginLoader() {}
}
