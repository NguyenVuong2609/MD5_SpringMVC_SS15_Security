package vuong.nguyen.service.role;

import vuong.nguyen.model.Role;
import vuong.nguyen.model.RoleName;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> findByName(RoleName name);
}
