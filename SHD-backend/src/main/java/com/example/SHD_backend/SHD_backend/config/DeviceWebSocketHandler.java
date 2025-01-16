package com.example.SHD_backend.SHD_backend.config;


import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class DeviceWebSocketHandler extends TextWebSocketHandler {
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // Example: Echo back the message
        session.sendMessage(new TextMessage("Received: " + message.getPayload()));
    }
}
