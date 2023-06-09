package vuong.nguyen.repository;

import vuong.nguyen.model.Role;
import vuong.nguyen.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName name);
}

