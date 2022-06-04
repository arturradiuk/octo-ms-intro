package com.aradiuk.octomsintro.demo;

import java.time.Duration;
import java.time.Instant;

public class StopWatch {
    private StopWatch() {
    }

    public static StopWatch instance() {
        return new StopWatch();
    }

    private Instant start;
    public Instant finish;

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
