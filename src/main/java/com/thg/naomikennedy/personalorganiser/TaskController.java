package com.thg.naomikennedy.personalorganiser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("task")
@CrossOrigin (origins = "http://localhost:3000")
public class TaskController {

    TaskRepository taskRepository;

    @Autowired
    public TaskController(final TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }

    @GetMapping("/tasks/all")
    public List<Task> getTasks() {
        return TaskRepository.getToDoList();
    }

    @PostMapping("/tasks/new")
    public TaskModel newTasks(@RequestBody TaskModel task){
        return task;
//        List<Task> currentTasks = TaskRepository.getToDoList();
//        Task task = new Task(description, started, finished, importance);
//        taskRepository.addNewTask(task);
//        return ResponseEntity.created(URI.create("/tasks/new"+task.getId())).build();
//        return "Success";
    }
}
