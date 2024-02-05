/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.project.fitness.fitnessprojectt;


/**
 *
 * @author faraz
 */
public class FitnessProjectt {
    public static void main(String[] args) { 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
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
