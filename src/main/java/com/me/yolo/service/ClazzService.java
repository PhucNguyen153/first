package com.me.yolo.service;

import com.me.yolo.entity.Clazz;
import com.me.yolo.model.Pagination;
import com.me.yolo.repository.ClazzRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ClazzService {
    @Autowired
    private ClazzRepo clazzRepo;

    public Pagination<Clazz> pagingClass(int page, int size){
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<Clazz> result = clazzRepo.pagingClass(pageRequest);
        Pagination<Clazz> pagination = new Pagination<>();
        pagination.copy(result);
        return pagination;
    }

    public Clazz create(Clazz clazz){
        clazz.setActive(true);
        return clazzRepo.save(clazz);
    }

    public Clazz update(Clazz clazz){
        return clazzRepo.save(clazz);
    }

    public boolean delete(Integer id){
        return true;
    }
}
