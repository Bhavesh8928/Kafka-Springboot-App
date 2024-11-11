package com.DeliveryBoy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class Count {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private static final Logger logger = LoggerFactory.getLogger(Count.class);

    public void getCount() {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count++;
        }
        System.out.println("Count is: " + count);
    }

    public void count() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            count = atomicInteger.incrementAndGet();
        }
        logger.info("Count is: " + count);
    }

    public static void main(String[] args) {
        Count c = new Count();
        c.count();  // count is 10
    }

}

