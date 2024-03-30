package com.org.java.util.collection;

public class PersonPriorityQueue implements Comparable<PersonPriorityQueue> {

    private String name;
    private int age;

    public PersonPriorityQueue(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(PersonPriorityQueue person) {
        return -Integer.compare(this.age, person.getAge());
    }
    
    @Override
    public String toString() {
        return name + "-" + age;
    }
}
