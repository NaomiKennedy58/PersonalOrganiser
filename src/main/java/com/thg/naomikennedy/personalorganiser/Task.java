package com.thg.naomikennedy.personalorganiser;

import java.time.LocalDateTime;

public record Task(String description, String started, String finished, Priority importance) {
    public String getId() {
        return description;
    }
}
