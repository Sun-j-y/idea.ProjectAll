package com.sforits.mongodbedu.mongotest;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/15-13:19 Created by IntelliJ IDEA.
 */
public class ClientTest {
    public MongoClient mongoClient;

    @Before
    public void before() {
        mongoClient = new MongoClient("192.168.162.130", 27017);
    }

    @Test
    public void test() {
        MongoIterable<String> strings = mongoClient.listDatabaseNames();
        for (String string : strings) {
            System.out.println(string);
        }
    }

    // 获取指定库
    @Test
    public void test2() {
        MongoDatabase mongoedu = mongoClient.getDatabase("mongoedu");
        MongoCollection<Document> temp = mongoedu.getCollection("temp");
        FindIterable<Document> tempDocs = temp.find();
        for (Document tempDoc : tempDocs) {
            System.out.println(tempDoc.get("_id") + " - " + tempDoc.get("age"));
        }
    }

    // 修改集合中数据
    @Test
    public void test3() {
        MongoCollection<Document> user = mongoClient.getDatabase("mongoedu").getCollection("user");
        // 更新条件
        Document document = new Document();
        document.put("age", 8);

        Document document1 = new Document();
        document1.put("name", "小黑");
        System.out.println(document);
        UpdateOptions updateOptions = new UpdateOptions();
        updateOptions.upsert(true);

        UpdateResult updateResult = user.replaceOne(document, document1, updateOptions);
        System.out.println(updateResult);
    }

    // 删除集合中数据
    @Test
    public void test4() {
        MongoCollection<Document> user = mongoClient.getDatabase("mongoedu").getCollection("user");
        Document document = new Document();
        document.put("name", "小黑");
        user.deleteMany(document);
    }

    // 查询记录
    @Test
    public void test5() {
        MongoCollection<Document> user = mongoClient.getDatabase("mongoedu").getCollection("user");
        Document document = new Document();
        document.put("name", "张三");
        FindIterable<Document> documents = user.find(document);
    }
}