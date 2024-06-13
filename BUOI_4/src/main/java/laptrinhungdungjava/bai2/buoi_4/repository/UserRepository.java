package laptrinhungdungjava.bai2.buoi_4.repository;


import laptrinhungdungjava.bai2.buoi_4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}