package aljunied.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUserId(int userId);
	public List<User> findByUserId(List<Integer> userIds);
	
}
