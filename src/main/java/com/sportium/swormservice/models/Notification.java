package com.sportium.swormservice.models;


import lombok.Data;

@Data
public class Notification {
    private String title;
    private String text;
    private String icon;
    private String userDestinationId;
}
