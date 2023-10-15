package edu.api.tasklater.repositories;

import edu.api.tasklater.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByIdUser(String idUser);
}
