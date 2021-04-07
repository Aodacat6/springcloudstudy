package com.mystudy.Dtos.basedata;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightDispatchTaskVo {

    private Long id;


    private Long flightId;

    private Long dispatchId;

    /**
     * 保障环节名称
     */
    private String dispatchName;


    private Long dispatchOrder;



    private Boolean isArrTask;

    private Boolean segment;

    private Boolean command = false;

    private Boolean triggerTaskFlag;

    private String inoutTypeCode;

    private String resourceTypeCode;

    private Long resourceTypeId;

    private String belongDeptId;

    private String taskStatusCode;

    private List<DispatchUserVo>  planDispatchUserDtoList;

    private List<DispatchUserVo>  realDispatchUserDtoList;

    private Boolean ifAbnormal = false;

    private List<DispatchAbnSimpleVo> dispatchTaskAbnList;

    private String assignTypeName;



    private Boolean manualOperatedFlag;


    private Long triggerTaskId;


    private String triggerTaskCode;


    private Long order;


    private List<FlightResourceDto> allotedResources;


    private Boolean critical;

    private String dispatchModeCode;

    private Boolean needCar;


    private Boolean isGender;


    private Long realDeltaT;


    private Long planDeltaT;


    private String shortName;


    private Boolean mainCritical;

    /**
     * 催办状态（0没有催办信息，1催办信息已确认，2催办信息未确认）
     */
    private String isAck;


    private String belongDeptName;

    private String realDeptName;


    private String dispatchUserDeptId;

    private Boolean isHasResource = false;

    private Boolean isNeedResource = false;

    private Boolean needProgress;
}
