package com.mar.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: 刘劲
 * @Date: 2020/4/25 13:23
 */
/** 如果使用@Component代替Configuration那么可以省略@EnableConfigurationProperties */
@Configuration
/** 自定义属性配置文件位置和名称 */
@PropertySource("classpath:test.properties")
/** 开启对应配置类的属性注入功能 */
@EnableConfigurationProperties(TestProperty.class)
@ConfigurationProperties(prefix = "test")
public class TestProperty {

    private int id;
    private String name;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TestProperty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
