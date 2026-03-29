package org.tpkprav.sec01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tpkprav.models.PersonOuterClass;

public class SimpleProtoDemo {

    private static final Logger log = LoggerFactory.getLogger(SimpleProtoDemo.class);

    public static void main(String[] args) {
        PersonOuterClass.Person person = PersonOuterClass
                .Person
                .newBuilder()
                .setName("John")
                .setAge(30)
                .build();
        log.info("Person: {}", person);

    }

}
