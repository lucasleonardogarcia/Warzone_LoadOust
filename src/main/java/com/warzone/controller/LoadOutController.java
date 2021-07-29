package com.warzone.controller;

import com.warzone.dto.LoadOutsDto;
import com.warzone.entity.LoadOuts;
import com.warzone.service.LoadOutsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("api/v1/warzone")
public class LoadOutController {

    @Autowired
    private LoadOutsService loadOutsService;

    @PostMapping("/")
    public ResponseEntity<Object> save(@RequestBody LoadOutsDto loadOutsDto) {
        LoadOuts newload = loadOutsService.save(loadOutsDto);
        if (newload != null) {
            return ResponseEntity.ok().body("Load Out Inserted");
        }
        return ResponseEntity.badRequest().body("No se agrego el Armamento");
    }

    @GetMapping("/get/loadouts")
    public ResponseEntity<Object> getAll(){
        return ResponseEntity.ok().body(loadOutsService.findAll());
    }

}
