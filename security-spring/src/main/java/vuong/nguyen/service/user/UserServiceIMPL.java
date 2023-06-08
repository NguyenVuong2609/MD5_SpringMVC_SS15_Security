package vuong.nguyen.service.user;

import org.springframework.stereotype.Service;
import vuong.nguyen.model.User;
import vuong.nguyen.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
@Service
public class UserServiceIMPL implements IUserService{
    @Autowired
    IUserRepository userRepository;
    @Override
    public Boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
