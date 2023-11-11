package com.ajou.sce3372.recycle.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.ajou.sce3372.recycle.entity.ItemInfo;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class RecycleService {

    private static final String COLLECTION_ITEMS = "items";

    public ItemInfo searchItem(String barcode) throws ExecutionException, InterruptedException {

        Firestore dbFirestore = FirestoreClient.getFirestore();

        DocumentReference documentReference = dbFirestore.collection(COLLECTION_ITEMS).document(barcode);

        ApiFuture<DocumentSnapshot> future = documentReference.get();

        DocumentSnapshot document = future.get();

        ItemInfo itemInfo = null;

        if (document.exists()) {
            itemInfo = document.toObject(ItemInfo.class);
            return itemInfo;
        } else {
            return null;
        }
    }
}
