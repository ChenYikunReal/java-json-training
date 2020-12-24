package org.example;

import com.google.gson.Gson;
import org.example.entity.Person;

public class GsonDemo {

    public static void main(String[] args) {
        Person person = new Person(123, "Sam");
        System.out.println(person);
        Gson gson = new Gson();
        String personJson = gson.toJson(person);
        System.out.println(personJson);
        Person p = gson.fromJson(personJson, Person.class);
        System.out.println(p);
    }

}
