package com.erlantzoniga.stormcourse;

import com.erlantzoniga.stormcourse.spouts.RandomSentenceSpout;
import com.erlantzoniga.stormcourse.utils.Constants;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.storm.Config;
import org.apache.storm.LocalCluster;
import org.apache.storm.topology.TopologyBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    Configurations configs = new Configurations();
    try {
      Configuration config = configs.properties(
          Thread.currentThread().getContextClassLoader().getResource("storm.properties"));

      TopologyBuilder builder = new TopologyBuilder();

      builder.setSpout(Constants.SPOUT_RANDOM_SENTENCE, new RandomSentenceSpout());

      // TODO: add the bolts;

      Config conf = new Config();

      if (config.getBoolean(Constants.Configuration.RUN_ON_LOCAL, false)) {
        conf.setDebug(true);

        LocalCluster cluster = new LocalCluster();
        // TODO: Run topology in local mode


        Thread.sleep(30000);

        cluster.shutdown();
      } else {
        // TODO: Configure number of workers

        // TODO: Run topology in remote cluster
      }
    } catch (Exception ex) {
      LOG.error("An exception occurred in main: {}", ex.getMessage(), ex);
    }
  }
}