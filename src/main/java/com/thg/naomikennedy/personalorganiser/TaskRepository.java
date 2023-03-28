package com.thg.naomikennedy.personalorganiser;

import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.LinkedList;
import java.time.LocalDateTime;

@Repository
public class TaskRepository {

    private static List<Task> toDoList;

    public TaskRepository() {
        this.toDoList=new LinkedList<Task>();
        this.toDoList.add(new Task("Wash the dishes", "false", "false", Priority.HIGH));
    }

    public static List<Task> getToDoList() {
        return toDoList;
    }

    public void addNewTask(final Task task){
        toDoList.add(task);
    }
}
