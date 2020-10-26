package com.sforits.sprintbootmongoedu.MongoTamplateTest;

import com.sforits.sprintbootmongoedu.SprintbootMongoEduApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/15-18:10 Created by IntelliJ IDEA.
 */
@SpringBootTest(classes = SprintbootMongoEduApplication.class)
public class MongoTest {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void test(){

    }
}