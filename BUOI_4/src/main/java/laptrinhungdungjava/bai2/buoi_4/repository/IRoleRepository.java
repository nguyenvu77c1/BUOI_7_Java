package laptrinhungdungjava.bai2.buoi_4.repository;


import laptrinhungdungjava.bai2.buoi_4.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    Role findRoleById(Long id);
}