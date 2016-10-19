package com.luckyakhi.springdemo.jsonparser;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonParserTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String jsonString = "{\"name\":\"akhilesh\",\"age\":29}";
		ObjectMapper mapper = new ObjectMapper();
 		try {
			Person person = mapper.readValue(jsonString, Person.class);
			System.out.println(person);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	

}