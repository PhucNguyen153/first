package com.me.yolo.service;

import com.me.yolo.entity.Parish;
import com.me.yolo.model.Pagination;
import com.me.yolo.repository.ParishRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ParishService {

    @Autowired
    private ParishRepo parishRepo;

    public Pagination<Parish> pagingParish(int page, int size){
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<Parish> result = parishRepo.pagingParish(pageRequest);
        Pagination<Parish> pagination = new Pagination<>();
        pagination.copy(result);
        return pagination;
    }

    public Parish create(Parish parish){
        parish.setActive(true);
        return parishRepo.save(parish);
    }

    public Parish update(Parish parish){
        return parishRepo.save(parish);
    }

    public boolean delete(Integer id){
        return true;
    }
}
