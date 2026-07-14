package prg_381_project.dao;

import java.util.List;
import prg_381_project.model.User;

public interface UserDAO {

    boolean addUser(User user);

    User getUserById(int userId);

    List<User> getAllUsers();

    boolean updateUser(User user);

    boolean deleteUser(int userId);
}