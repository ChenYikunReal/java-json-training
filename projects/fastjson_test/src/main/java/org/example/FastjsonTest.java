package org.example;

import java.util.Date;

import com.alibaba.fastjson.JSON;

public class FastjsonTest {

    private static void serialize() {
        Person person = new Person(15, "Sam", new Date());
        String jsonString = JSON.toJSONString(person);
        System.out.println(jsonString);
    }

    private static void deserialize() {
        String jsonString = "{\"AGE\":\"15\",\"DATE OF BIRTH\":\"2020-12-12 02:55:00\",\"FULL NAME\":\"Sam\"}";
        Person person = JSON.parseObject(jsonString, Person.class);
        System.out.println(person);
    }

    public static void main(String[] args) {
        serialize();
        deserialize();
    }

}
