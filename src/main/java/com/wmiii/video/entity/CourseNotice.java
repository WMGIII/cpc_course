package com.wmiii.video.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class CourseNotice {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String title;
    private Integer courseId;
    private String detail;
    private Long date;
}
