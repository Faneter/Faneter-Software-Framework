package pers.faneter.framework.plugin.util;

import pers.faneter.framework.plugin.Plugin;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * 从文件中读取插件<br>
 * 需要被读取的插件的jar包中提供plugin.xml文件, 此文件的格式在本包中的PluginDescription有定义
 */
public class PluginReader {
  public static Plugin getPluginFromFile(File file)
      throws MalformedURLException, ClassNotFoundException {
    URLClassLoader urlClassLoader = new URLClassLoader(new URL[] {file.toURL()});
    Class cl = Class.forName("Foo", true, urlClassLoader);

    return null;
  }
}
