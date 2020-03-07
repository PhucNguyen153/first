package com.me.yolo.service;

import com.me.yolo.entity.Children;
import com.me.yolo.model.Pagination;
import com.me.yolo.repository.ChildrenRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ChildrenService {
    @Autowired
    private ChildrenRepo childrenRepo;

    public Pagination<Children> pagingChildren(int page, int size){
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<Children> result = childrenRepo.pagingChildren(pageRequest);
        Pagination<Children> pagination = new Pagination<>();
        pagination.copy(result);
        return pagination;
    }

    public Children create(Children children){
        children.setActive(true);
        return childrenRepo.save(children);
    }

    public Children update(Children children){
        return childrenRepo.save(children);
    }

    public boolean delete(Integer id){
        return true;
    }
}
