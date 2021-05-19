package com.company;

import com.company.entity.MessageEntity;

public class Main {

    public static void main(String[] args) {
        MessageEntity msg = new MessageEntity();
        msg.setTitle("A different title");
        msg.setMessage("different message");
        msg.setRead(true);
        System.out.println(msg.getTitle());
        System.out.println(msg.getMessage());
        System.out.println(msg.isRead());
    }
}
