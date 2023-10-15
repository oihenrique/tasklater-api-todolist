package edu.api.tasklater.controller;

import edu.api.tasklater.dtos.TaskDto;
import edu.api.tasklater.model.Task;
import edu.api.tasklater.repositories.TaskRepository;
import edu.api.tasklater.util.Utils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository repository;

    @PostMapping()
    public ResponseEntity<Object> create(@RequestBody @Valid TaskDto taskDto, HttpServletRequest request) {
        var idUser = request.getAttribute("idUser").toString();
        if (LocalDateTime.now().isAfter(taskDto.startAt())
                || LocalDateTime.now().isBefore(taskDto.endAt())
                || taskDto.startAt().isAfter(taskDto.endAt())) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("The start date/end date must be greater than the current date.");
        }

        repository.save(new Task(taskDto, idUser));
        return ResponseEntity.ok().body(taskDto);
    }

    @GetMapping
    public List<Task> list(HttpServletRequest request) {
        var idUser = request.getAttribute("idUser");
        List<Task> tasks = this.repository.findByIdUser(idUser.toString());
        return tasks;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@RequestBody TaskDto taskDto, @PathVariable Long id, HttpServletRequest request) {
        var task = this.repository.findById(id).orElse(null);

        if (task == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Task not found");
        }

        var idUser = request.getAttribute("idUser");

        if (!task.getIdUser().equals(idUser)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Unauthorized user");
        }

        Utils.copyNonNullProperties(taskDto, task);
        return ResponseEntity.ok().body(this.repository.save(task));
    }
}
