package com.me.yolo.service;

import com.me.yolo.entity.Role;
import com.me.yolo.repository.RoleRepo;
import com.me.yolo.utilities.Constant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@Component
public class RoleService {

    @Autowired
    private RoleRepo roleRepo;

    public  List<Role> getAllRole(){
        List<Role> roles = roleRepo.findAllExceptSuperAdmin(Constant.ROLE_SUPER_ADMIN);
        return roles;
    }

    public Role create(Role role){
        role.setActive(true);
        return roleRepo.save(role);
    }
}
