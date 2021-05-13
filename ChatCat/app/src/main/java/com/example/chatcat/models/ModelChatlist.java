package com.example.chatcat.models;

public class ModelChatlist {
    //we will need this is to get chat list, sender/receiver uid
    String id;

    public ModelChatlist(String id) {
        this.id = id;
    }

    public ModelChatlist() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
