package kodlamaio.hrms.core.dataAccess;

import kodlamaio.hrms.core.entities.UserAdd;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAddDao extends JpaRepository<UserAdd,Integer> {
    UserAdd getByEmail(String email);
}
