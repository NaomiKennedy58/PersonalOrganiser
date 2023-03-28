package com.thg.naomikennedy.personalorganiser;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TaskModel {
    @Id
    private String description;
    private String started;
    private String finished;
    private Priority importance;

    public TaskModel(){}

    public TaskModel (String description, String started, String finished, Priority importance) {
        this.description = description;
        this.started = started;
        this.finished = finished;
        this.importance = importance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStarted() {
        return started;
    }

    public void setStarted(String started) {
        this.started = started;
    }

    public String getFinished() {
        return finished;
    }

    public void setFinished(String finished) {
        this.finished = finished;
    }

    public Priority getImportance() {
        return importance;
    }

    public void setImportance(Priority importance) {
        this.importance = importance;
    }

}
