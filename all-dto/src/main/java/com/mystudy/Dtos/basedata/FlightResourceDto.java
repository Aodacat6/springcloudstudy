package com.mystudy.Dtos.basedata;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Date;

/**
 * @Description:
 * @Author: yuanxuegang
 * @Date: 2019/11/11
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightResourceDto {

    private Long id;


    private String name;

}
