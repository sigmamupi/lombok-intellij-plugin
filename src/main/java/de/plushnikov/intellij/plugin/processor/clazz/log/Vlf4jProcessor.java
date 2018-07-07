package de.plushnikov.intellij.plugin.processor.clazz.log;

import lombok.extern.vlf4j.Vlf4j;

public class Vlf4jProcessor extends AbstractLogProcessor {

  private static final String LOGGER_TYPE = "com.via.util.log.LogWrapper";
  private static final String LOGGER_CATEGORY = "%s.class";
  private static final String LOGGER_INITIALIZER = "com.via.util.log.LogWrapper.getLogger(%s)";

  public Vlf4jProcessor() {
    super(Vlf4j.class, LOGGER_TYPE, LOGGER_INITIALIZER, LOGGER_CATEGORY);
  }
}
