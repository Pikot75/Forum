package by.webproject.forum.service;

import by.webproject.forum.entity.User;

import java.util.List;
import java.util.Optional;

public class SimpleUserService implements UserService{
    String git = "service";
    @Override
    public User addUserAsAdmin(String login, String password, String secretKey) {
        return null;
    }
    @Override
    public User addUserAsClient(String login, String password) {
        return null;
    }

    @Override
    public Optional<User> authenticationIfAdmin(String login, String password) {
        return Optional.empty();
    }

    @Override
    public Optional<User> authenticationIfClient(String login, String password) {
        return Optional.empty();
    }

    @Override
    public List<User> findAllClient() {
        return null;
    }
}
