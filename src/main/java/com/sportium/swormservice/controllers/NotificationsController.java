package com.sportium.swormservice.controllers;

import com.sportium.swormservice.models.Notification;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class NotificationsController {

    @MessageMapping("/test")
    @SendTo("/topic/notifications")
    public String triggerNotification(Notification notification) throws Exception {
        Thread.sleep(100);
        return "Notification received";
    }

}
