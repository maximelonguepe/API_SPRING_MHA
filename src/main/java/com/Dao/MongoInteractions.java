package com.Dao;

import com.metier.Hero;
import com.mongodb.*;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class MongoInteractions {
    public static List<Hero> getHeroes() {
        try {
            MongoClient mongoClient = new MongoClient();
            DB database = mongoClient.getDB("MHA");
            DBCollection collection = database.getCollection("Heroes");
            DBCursor list=collection.find();
            List<DBObject> listHeroes=list.toArray();

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        return new ArrayList<Hero>();
    }
}
