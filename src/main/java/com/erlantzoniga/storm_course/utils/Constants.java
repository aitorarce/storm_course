package com.erlantzoniga.storm_course.utils;

public class Constants {
  public static final String TOPOLOGY_NAME = "STORM_COURSE_TOPOLOGY";

  public static final String SPOUT_RANDOM_SENTENCE = "RANDOM_SENTENCE_SPOUT";

  public static final String BOLT_SPLIT_SENTENCE = "SPLIT_SENTENCE_BOLT";
  public static final String BOLT_WORD_COUNT= "WORD_COUNT_BOLT";

  public static final String TWEET_ID = "TWEET_ID";
  public static final String TWEET_TEXT = "TWEET_TEXT";
  public static final String TWEET_METADATA = "TWEET_METADATA";
  public static final String WORD = "WORD";

  public class Configuration {
    public static final String RUN_ON_LOCAL = "Storm.Topology.Local";
    public static final String TOPOLOGY_WORKERS = "Storm.Topology.Workers";
  }
}
