package edu.api.tasklater.model;

import edu.api.tasklater.dtos.TaskDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity(name = "tasks")
@Table(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String title;
    private String priority;
    private LocalDateTime startAt;
    private LocalDateTime endAt;

    private String idUser;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public void setTitle(String title) throws Exception {
        if (title.length() > 255) {
            throw new Exception("Maximum character limit (255) exceeded.");
        }

        this.title = title;
    }

    public Task(TaskDto taskDto, String userId) {
        this.idUser = userId;
        this.title = taskDto.title();
        this.description = taskDto.description();
        this.priority = taskDto.priority();
        this.startAt = taskDto.startAt();
        this.endAt = taskDto.endAt();
    }
}
