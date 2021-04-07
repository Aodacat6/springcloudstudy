package com.mystudy.Dtos.basedata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Date;

/**
 * @author JiangHaiqing
 * @version 1.0.0
 * @ClassName DispatchAbnSimpleVo.java
 * @Description 保障任务异常vo--可视化使用
 * @createTime 2020年04月02日 15:27:00
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class DispatchAbnSimpleVo {

    private Long id;

    private Long dispatchTaskId;

    private String reason;


}
