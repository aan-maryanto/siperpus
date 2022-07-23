package com.siperpus.siperpus.services;

import java.util.List;

import com.siperpus.siperpus.entity.Role;
import com.siperpus.siperpus.entity.User;

public interface  UserService {

    /**
     * @param user
     * @return
     */
    User saveUser(User user);
     
    /**
     * @param role
     * @return
     */
    Role saveRole(Role role);

    /**
     * @param username
     * @param roleName
     */
    void addRoleToUser(String username, String roleName);

    /**
     * @param username
     * @return
     */
    User getUser(String username);

    /**
     * @return
     */
    List<User> getUsers();
    
}
