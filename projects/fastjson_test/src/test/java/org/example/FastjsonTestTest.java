package org.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

/**
 * Unit test for simple App.
 */
public class FastjsonTestTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void whenJson_thanConvertToObjectCorrect() {
        Person person = new Person(15, "Sam", new Date());
        String jsonObject = JSON.toJSONString(person);
        Person newPerson = JSON.parseObject(jsonObject, Person.class);

        assertEquals(newPerson.getAge(), 0);
        assertEquals(newPerson.getFullName(), "Sam");
    }

}
