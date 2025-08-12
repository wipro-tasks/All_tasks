
package com.example.demo.model;

public class Account {
    private String id;
    private String type;
    private String status;

    public Account(String id, String type, String status) {
        this.id = id;
        this.type = type;
        this.status = status;
    }

    public String getId() {
        return id;
    }
    public String getType() {
        return type;
    }
    public String getStatus() {
        return status;
    }
}
