package com.company.entity;

public class MessageEntity {

    private String message;
    private String title;
    private boolean isRead = true;

    public MessageEntity(String message, String title, boolean isRead) {
        this.message = message;
        this.title = title;
        this.isRead = isRead;
    }

    public MessageEntity(){}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String isRead() {

        return (isRead) ? "Online":"Off line";
//        String str;
//        if(isRead){
//            str= "Online";
//        }else{
//            str = "Off line";
//        }
//        return str;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
}
