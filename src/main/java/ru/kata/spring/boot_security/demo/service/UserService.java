package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    public List<User> allUsers();

    public User getUserById(Long id);

    public User findUserByUsername(String name);

    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(Long id);

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException;
}