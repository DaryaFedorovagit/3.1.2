package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.entity.Role;
import ru.kata.spring.boot_security.demo.repository.RoleRepository;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository grantedAuthority;

    @Autowired
    public RoleServiceImpl(RoleRepository grantedAuthority) {
        this.grantedAuthority = grantedAuthority;
    }

    @Override
    public List<Role> getAllRole() {
        return grantedAuthority.findAll();
    }

    @Override
    public void add(Role role) {
        grantedAuthority.save(role);
    }
}