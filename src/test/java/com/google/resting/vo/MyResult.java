package com.google.resting.vo;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class MyResult implements Serializable {

    @SerializedName("es:title")
    private String title;

    @SerializedName("es:link")
    private Link[] link;

    @SerializedName("es:relevance")
    private float relevance;

    @SerializedName("es:updated")
    private Date updated;

    @SerializedName("es:id")
    private String id;

    @SerializedName("es:thumbnail")
    private Thumbnail thumbnail;

    @SerializedName("es:documentSource")
    private String documentSource;

    @SerializedName("es:firstOfASite")
    private boolean firstOfASite;

    @SerializedName("es:author")
    private Author author;

    @SerializedName("ibmsc:field")
    private Field fields;

    @SerializedName("es:summary")
    private String summary;

    public String getTitle() {
        return title;
    }

    public Link[] getLink() {
        return link;
    }

    public float getRelevance() {
        return relevance;
    }

    public Date getUpdated() {
        return updated;
    }

    public String getId() {
        return id;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public String getDocumentSource() {
        return documentSource;
    }

    public boolean isFirstOfASite() {
        return firstOfASite;
    }

    public Author getAuthor() {
        return author;
    }

/*	public Field getField() {
        return field;
	}*/

    public String getSummary() {
        return summary;
    }

}
