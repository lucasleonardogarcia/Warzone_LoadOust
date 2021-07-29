package com.warzone.service;


import com.warzone.dto.LoadOutsDto;
import com.warzone.entity.LoadOuts;
import com.warzone.repository.LoadOutsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoadOutsService {

    @Autowired
    private LoadOutsRepository loadOutsRepository;


    public LoadOutsService(LoadOutsRepository loadOutsRepository) {
        this.loadOutsRepository = loadOutsRepository;
    }
    public LoadOuts save (LoadOutsDto loadOutsDto){
        LoadOuts loadOuts=new LoadOuts();
        loadOuts.setImg(loadOutsDto.getImg());
        loadOuts.setWeaponName(loadOutsDto.getWeaponName());
        loadOuts.setStreamer(loadOutsDto.getStreamer());
        return loadOutsRepository.save(loadOuts);

    }
    public List<LoadOuts> findAll (){
       return loadOutsRepository.findAll();
    }
}
