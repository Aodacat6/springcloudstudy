package com.mystudy.Dtos.basedata;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Date;


/**
 * @Description:
 * @Author: yuanxuegang
 * @Date: 2019/11/05
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DispatchUserVo {

    private String deptId;


    private String deptName;

    private String team;

    private String dispatchUserId;

    private Long dispatchTaskId;

    private String dispatchUserName;
    /**
     * 交接人id
     *
     */
    private String handOverDispatchUserId;

    /**
     * 交接人名称
     *
     */
    private String handOverDispatchUserName;

    private String vehicleId;

    private String vehicleNo;

    private Long resourceId;



    private String  confirmStatus;

}
