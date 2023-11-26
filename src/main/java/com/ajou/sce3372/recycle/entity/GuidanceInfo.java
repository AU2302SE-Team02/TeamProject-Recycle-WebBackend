package com.ajou.sce3372.recycle.entity;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.spring.data.firestore.Document;

import java.util.HashMap;
import java.util.Map;

@Document(collectionName = "guidance")
public class GuidanceInfo {

    @DocumentId private String guideLocationNameDocuID;

    private Timestamp guideDateCreated;

    private Timestamp guideDateModified;

    private Timestamp guideDateUpdated;

    private Map<String, String> guideHigherAuthority;

    private String guideLocationName;

    private Map<String, String> guideMaterials;

    public String getGuideLocationNameDocuID() {
        return guideLocationNameDocuID;
    }

    public String getGuideDateCreated() {
        return guideDateCreated.toString();
    }

    public String getGuideDateModified() {
        return guideDateModified.toString();
    }

    public String getGuideDateUpdated() { return guideDateUpdated.toString(); }

    public Map<String, String> getGuideHigherAuthority() {
        return guideHigherAuthority;
    }

    public String getGuideLocationName() {
        return guideLocationName;
    }

    public Map<String, String> getGuideMaterials() {
        return guideMaterials;
    }
}
