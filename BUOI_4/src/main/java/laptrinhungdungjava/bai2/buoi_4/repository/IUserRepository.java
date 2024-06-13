package laptrinhungdungjava.bai2.buoi_4.repository;


import laptrinhungdungjava.bai2.buoi_4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsername(String username);
}