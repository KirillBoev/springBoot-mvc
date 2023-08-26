package ru.javamentor.springmvc.service;

import ru.javamentor.springmvc.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    List<User> showUsers();

    User getUser(Long id);

    void delete(Long id);

    void update(User user);
}
