package Service;
//import Model.User;

import Model.User;

import java.util.List;

public interface UserService {
    void SaveUser(User user);

    List<User> FindAll();
    User FindUserById (Long id);
    void deleteUserById(Long id);
}
