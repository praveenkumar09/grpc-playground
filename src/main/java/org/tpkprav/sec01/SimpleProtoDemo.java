package org.tpkprav.sec01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tpkprav.models.sec02.Person;

public class SimpleProtoDemo {

    private static final Logger log = LoggerFactory.getLogger(SimpleProtoDemo.class);

    public static void main(String[] args) {
        Person person1 = Person
                .newBuilder()
                .setName("John")
                .setAge(30)
                .build();
        Person person2 = Person
                .newBuilder()
                .setName("John")
                .setAge(30)
                .build();


        //equality? check
        log.info("Person1 .equals() Person2 {}", person1.equals(person2));
        log.info("Person1 == Person2 {}", person1 == person2);


        //mutable? check
        // not mutable

        // create another instance with diff values
        Person person3 = person1.toBuilder()
                .setName("Mike")
                .build();
        log.info("Person1 == Person3 {}", person1 == person3);
        log.info("Person1 .equals() Person3 {}", person1.equals(person3));

        //null?
        Person person4 = person1.toBuilder()
                .clearName()
                .build();
        log.info("Person4 {}", person4);
        log.info("Person3 {}", person3);

    }

}
