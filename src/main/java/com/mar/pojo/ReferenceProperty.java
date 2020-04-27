package com.mar.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: 刘劲
 * @Date: 2020/4/25 13:51
 */
@Component
@PropertySource("classpath:reference.properties")
@ConfigurationProperties(prefix = "app")
public class ReferenceProperty {

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ReferenceProperty{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
