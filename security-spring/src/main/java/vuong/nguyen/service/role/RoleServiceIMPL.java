package vuong.nguyen.service.role;

import org.springframework.stereotype.Service;
import vuong.nguyen.model.Role;
import vuong.nguyen.model.RoleName;
import vuong.nguyen.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@Service
public class RoleServiceIMPL implements IRoleService{
    @Autowired
    IRoleRepository repository;
    @Override
    public Optional<Role> findByName(RoleName name) {
        return repository.findByName(name);
    }
}
