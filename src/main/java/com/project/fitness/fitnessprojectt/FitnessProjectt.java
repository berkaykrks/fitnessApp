/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.project.fitness.fitnessprojectt;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author faraz
 */
public class FitnessProjectt {
    public static void main(String[] args) { 
        Register regis = new Register();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
                regis.registerUser();
            }
        });
        
        
        
        /*
        MongoClient client = MongoClients.create("mongodb+srv://ata:12345@fitnessapp.ssm1bhf.mongodb.net/?retryWrites=true&w=majority");
        
        MongoDatabase db = client.getDatabase("berkay");
        MongoCollection col = db.getCollection("berkayCollection");
        Document sampleDoc=new Document("_id","1").append("name","John");
        col.insertOne(sampleDoc);
        */
        
    }
    
}
