package com.mar.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: 刘劲
 * @Date: 2020/4/25 13:42
 */
@Component
@PropertySource("classpath:random.properties")
public class MyRandom {
    @Value("${myRandom.value}")
    private String value;
    @Value("${myRandom.number}")
    private String number;
    @Value("${myRandom.bignumber}")
    private String bignumber;
    @Value("${myRandom.uuid}")
    private String uuid;
    @Value("${myRandom.number.less.than.ten}")
    private String lessThan;
    @Value("${myRandom.number.in.range}")
    private String range;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBignumber() {
        return bignumber;
    }

    public void setBignumber(String bignumber) {
        this.bignumber = bignumber;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getLessThan() {
        return lessThan;
    }

    public void setLessThan(String lessThan) {
        this.lessThan = lessThan;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "MyRandom{" +
                "value='" + value + '\'' +
                ", number='" + number + '\'' +
                ", bignumber='" + bignumber + '\'' +
                ", uuid='" + uuid + '\'' +
                ", lessThan='" + lessThan + '\'' +
                ", range='" + range + '\'' +
                '}';
    }
}
