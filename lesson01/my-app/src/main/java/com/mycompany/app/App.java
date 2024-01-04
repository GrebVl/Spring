package com.mycompany.app;

import com.google.gson.Gson;


public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person("Igor", 21);
        System.out.println(person.getName() + "  " + person.getAge());
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
        Person person1 = gson.fromJson(json, Person.class);
        System.out.println(person1.toString());

    }
}
