package com.ajou.sce3372.recycle.repository;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Repository;

import com.ajou.sce3372.recycle.entity.ItemInfo;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;

// Repository
@Repository
public class ItemRepo {
    
    private static final String COLLECTION_ITEMS = "items";

    public ItemInfo getItemInfo(String barcode) throws ExecutionException, InterruptedException {

        Firestore dbFirestore = FirestoreClient.getFirestore();

        DocumentReference documentReferenceItem = dbFirestore.collection(COLLECTION_ITEMS).document(barcode);

        ApiFuture<DocumentSnapshot> futureItem = documentReferenceItem.get();

        DocumentSnapshot documentItem = futureItem.get();

        ItemInfo itemInfo = new ItemInfo();

        if (documentItem.exists()) {
            itemInfo = documentItem.toObject(ItemInfo.class);
            return itemInfo;
        } else {
            System.out.println("Error: Following document doesn't exist - " + barcode);
            return null;
        }
    }
}
