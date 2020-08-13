package com.sashasol.kafkatwitter.producer;

import twitter4j.*;

public class Main {
    private final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws TwitterException, InterruptedException {

        TwitterProducer producer = new TwitterProducer();
        producer.run();


    }

}
