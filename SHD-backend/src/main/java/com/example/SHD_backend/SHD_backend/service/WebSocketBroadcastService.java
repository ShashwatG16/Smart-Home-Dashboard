package com.example.SHD_backend.SHD_backend.service;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.util.ArrayList;
import java.util.List;

@Service
public class WebSocketBroadcastService {
    private final List<WebSocketSession> sessions = new ArrayList<>();

    public void addSession(WebSocketSession session) {
        sessions.add(session);
    }

    public void broadcastMessage(String message) {
        for (WebSocketSession session : sessions) {
            try {
                session.sendMessage(new TextMessage(message));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
