package pers.faneter.framework.file.config;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Config {
  private File file = null;

  private Properties properties = null;

  private Config() {}

  public Config(String filepath) {
    this(new File(filepath));
  }

  public Config(File file) {
    this.file = file;
    init();
  }

  private void init() {
    try {
      FileInputStream fis = new FileInputStream(file);
      InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
      Properties p = new Properties();
      p.load(isr);
      this.properties = p;
      fis.close();
      isr.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String read(String key) {
    return this.properties.getProperty(key);
  }

  public void add(String key, String value) {
    this.properties.setProperty(key, value);
  }

  public void remove(String key) {
    this.properties.remove(key);
  }

  public void save() throws IOException {
    this.properties.store(new FileWriter(file), "");
  }
}
