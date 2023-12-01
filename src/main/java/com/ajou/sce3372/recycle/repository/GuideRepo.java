package com.ajou.sce3372.recycle.repository;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Repository;

import com.ajou.sce3372.recycle.entity.GuideInfo;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;

// Repository
@Repository
public class GuideRepo {
    
    private static final String COLLECTION_GUIDES = "guides";

    public GuideInfo getGuideInfo(String location) throws ExecutionException, InterruptedException {

        Firestore dbFirestore = FirestoreClient.getFirestore();

        DocumentReference documentReferenceGuide = dbFirestore.collection(COLLECTION_GUIDES).document(location);

        ApiFuture<DocumentSnapshot> futureGuide = documentReferenceGuide.get();

        DocumentSnapshot documentGuide = futureGuide.get();

        GuideInfo guideInfo = new GuideInfo();

        if (documentGuide.exists()) {
            System.out.println("Following document exists - " + location);
            guideInfo = documentGuide.toObject(GuideInfo.class);
            return guideInfo;
        } else {
            System.out.println("Error: Following document doesn't exist - " + location);
            return null;
        }
    }
}
