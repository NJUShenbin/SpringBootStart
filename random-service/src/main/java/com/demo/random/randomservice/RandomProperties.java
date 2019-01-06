package com.demo.random.randomservice;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("myrandom")
public class RandomProperties {

    private int upBound = 0;

    public int getUpBound() {
        return upBound;
    }

    public void setUpBound(int upBound) {
        this.upBound = upBound;
    }

}
