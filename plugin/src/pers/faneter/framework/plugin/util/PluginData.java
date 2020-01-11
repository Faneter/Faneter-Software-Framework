package pers.faneter.framework.plugin.util;

import java.util.HashMap;
import java.util.Map;

/** 通过本类，把你的程序想要共享的对象共享，便利插件间沟通 */
public class PluginData {
  private static Map<String, Object> datas = new HashMap<>();

  public static Object getData(String dataName) {
    return datas.get(dataName);
  }

  public static void addData(String dataName, Object data) {
    datas.put(dataName, data);
  }
}
