package Service;

import Model.User;
import Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
@Autowired
private UserRepository userRepository;
    @Override
    public void SaveUser(User user) {

        userRepository.save(user);
    }

    @Override
    public List<User> FindAll() {
        return userRepository.findAll();
    }

    @Override
    public User FindUserById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public void deleteUserById(Long id) {
userRepository.deleteById(id);
    }
}
