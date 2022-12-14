package com.example.assignment2tracker;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
@RestController
@RequestMapping("/api/v1")
public class Control {
    ArrayList<Manage> Task =new ArrayList<>();
    @GetMapping("/Task")
    public ArrayList<Manage> getManage(){
        return Task;
    }
    @Autowired
    private TaskManage taskmanage;
    @PostMapping("/Add")
    public String addTask(@RequestBody Manage manage){
        manage=new Manage();
        Manage.add(manage);
        return "add";
    }
    @PutMapping("/{index}")
    public String UpdateTasks(@PathVariable int index,@RequestBody Manage Task){
        Manage.set(index, Task );
        return "Has been updated!";
    }

    @GetMapping("/Collection")
    Collection<Manage> getTask() {
        Class<? extends ArrayList> preTasks = Task.getClass();

        if (preTasks == null) {
            return new ArrayList<Manage>();
        }
        else {
            return preTasks;
        }
    }
    @DeleteMapping("/Remove")
    public String deleteTask(@PathVariable int index){
        Manage.remove(index);
        return "item has been deleted";
    }
    @GetMapping("/list")
    public String getAllTasks(@PathVariable @NotNull Manage tasks) {
        List<Manage> theTasks = taskmanage.getAllTasks();
        return "list-tasks";
    }

    //Didn't really know how to finish it put i'm gonna send it anyways :)
}
