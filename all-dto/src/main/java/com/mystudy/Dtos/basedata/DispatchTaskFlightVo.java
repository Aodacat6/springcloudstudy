package com.mystudy.Dtos.basedata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 保障大列表航班详情Vo
 * @Author: yuanxuegang
 * @Date: 2019/11/01
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DispatchTaskFlightVo {

    /**
     *进港航班id
     */

    private Long arrFlightId;

    /**
     *出港航班id
     */
    private Long depFlightId;

    /**
     *任务
     */
    private String flightTask;



    /**
     *机号
     */
    private String craftNo;

    /**
     *机型
     */
    private String craftModelName;

    /**
     *机位
     */
    private String craftSeatName;

    /**
     *到达时间
     */
    private String arrTime;

    /**
     *起飞时间
     */
    private String depTime;

    /**
     *进港状态Id
     */
    private Long arrStatusId;


    private Long depStatusId;

    private String arrStatus;


    private String depStatus;


    private String arrStatusName;


    private String depStatusName;


    private String arrAbnStatus;


    private String arrAbnStatusName;


    private Long depAbnStatusId;


    private String flightDispatchStatusCode;


    private String depAbnStatus;


    private String abnStatusName;


    private String depAbnStatusName;


    private String gateName;


    private String regionName;


    private String arrRegionName;


    private String depRegionName;

    private String arrDepCode;


    private String date;


    private String arrFlyDate;

    private String depFlyDate;





    private String arrAbnRsn;


    private String depAbnRsn;


    private String preDepTime;

    private String prePlanDepTime;


    private String preAlterDepTime;


    private String preRealDepTime;


    private String planArrTime;


    private String alterArrTime;


    private String realArrTime;


    private String planDepTime;


    private String alterDepTime;


    private String realDepTime;


    private String nextArrTime;


    private String nextPlanArrTime;


    private String nextAlterArrTime;


    private String nextRealArrTime;


    private Long airlineId;


    private String airlineName;

    private String arrKeyGuarantee;

    private String depKeyGuarantee;

    private String ckicName;

    private String acrslSubName;

    private String dcrslSubName;


    private String planFinishTime;


    private String alterFinishTime;


    private String realFinishTime;

    private List<FlightDispatchTaskVo> arrDispatchTaskDtoList;


    private List<FlightDispatchTaskVo> depDispatchTaskDtoList;



    private List<FlightDispatchTaskVo> triggerTaskList;


    private Boolean arrIsVip = false;

    private Boolean depIsVip = false;

    private Boolean focus = false;




    private List<String> airportNameList;


    private Boolean isFarSeat;

    private String flyDate;


    private String iceStatus;

    private String flightStatus;

    private Long order;

    private Long abnOrder;

    private String abnormalStatus;

    private String iceSeat;

    private String deicingType;

    private String flightColor;

    private String Cobt;

    private String stageCode;

    private String status;

    private String dispatchFinishTime;

    private String closeDoorTime;


    private String openDoorTime;

    private String pickUpTime;

    private String departureTime;


    private String boardingStartTime;

    private String boardingEndTime;


    private String planCloseDoorTime;


    private String planOpenDoorTime;


    private String planPickUpTime;

    private String planDepartureTime;


    private String planBoardingStartTime;

    private String planBoardingEndTime;

    private String airlinesubName;


    private String airlinesubIata;

    private String airlinesubIcao;

    private Long craftSeatId;








}
