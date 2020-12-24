package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entity.Person;

import java.io.File;
import java.io.IOException;

public class JacksonDemo {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Person obj = new Person(123, "Sam");
        // 写为字符串
        String text = mapper.writeValueAsString(obj);
        // 写入文件
        mapper.writeValue(new File("person.json"), obj);
        // 写入字节流
        byte[] bytes = mapper.writeValueAsBytes(obj);
        System.out.println(text);
        // 从字符串中读取
        Person p = mapper.readValue(text, Person.class);
        System.out.println(p);
        // 从字节流中读取
        p = mapper.readValue(bytes, Person.class);
        System.out.println(p);
        // 从文件中读取
        p = mapper.readValue(new File("person.json"), Person.class);
        System.out.println(p);
    }

}
