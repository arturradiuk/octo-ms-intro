package com.aradiuk.octomsintro.demo;

import java.time.Duration;
import java.time.Instant;

public class StopWatch {
    public Instant finish;
    private Instant start;

    private StopWatch() {
    }

    public static StopWatch instance() {
        return new StopWatch();
    }

    public void start() {
        if (start != null) {
            throw new RuntimeException();
        }
        this.start = Instant.now();
    }

    public void stop() {
        if (finish != null) {
            throw new RuntimeException();
        }
        this.finish = Instant.now();
    }

    public long watch() {
        if (finish == null) {
            return Duration.between(start, Instant.now()).toMillis();
        }
        return Duration.between(start, finish).toMillis();
    }
}
