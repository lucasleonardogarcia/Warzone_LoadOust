package com.warzone.dto;

import lombok.Data;


import java.io.Serializable;

@Data
public class LoadOutsDto implements Serializable {

    private long id;
    private String streamer;
    private String weaponName;
    private String img;


}