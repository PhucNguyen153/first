package com.me.yolo.repository;

import com.me.yolo.entity.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepo extends CrudRepository<Role, Integer> {

    @Query(value = "SELECT r FROM Role r WHERE r.name not like :sa")
    List<Role> findAllExceptSuperAdmin(@Param("sa") String sa);
}
