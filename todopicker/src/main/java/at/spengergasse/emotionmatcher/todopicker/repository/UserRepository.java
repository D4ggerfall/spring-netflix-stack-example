package at.spengergasse.emotionmatcher.todopicker.repository;

import at.spengergasse.emotionmatcher.todopicker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>
{

}
