package com.xx.idoctorall.entity.nonrelation;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 检查列表
 */
@Data
@Entity(name = "detection")
@ApiModel
public class Detection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int pid;//病人id
    private int did;//就诊医生id
    private int prescriptionid;//处方id
    private Date time;//检查单生成时间
    private String detaillist;//检查项（检查项1、检查项2......）
}
