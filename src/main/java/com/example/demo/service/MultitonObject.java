package com.example.demo.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MultitonObject {

  private static final Map<String, Object> objects;

  static {
    objects = new ConcurrentHashMap<>();
    objects.put("1", new Object());
    objects.put("2", new Object());
  }

  public static Object getInstance(String key) {
    return objects.get(key);
  }
}
