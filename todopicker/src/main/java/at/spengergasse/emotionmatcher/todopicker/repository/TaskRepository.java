package at.spengergasse.emotionmatcher.todopicker.repository;

import at.spengergasse.emotionmatcher.todopicker.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
}
