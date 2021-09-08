package com.wmiii.video.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wmiii.video.utils.LongJsonDeserializer;
import com.wmiii.video.utils.LongJsonSerializer;
import lombok.Data;

import java.util.List;

@Data
public class CourseVideo {
    @TableId(value = "id", type = IdType.AUTO)
    Integer id;

    @JsonDeserialize(using = LongJsonDeserializer.class)
    @JsonSerialize(using = LongJsonSerializer.class)
    Long videoId;
    Integer courseId;
    Integer teacherId;
    String name;
    String fileType;
    String url;
    String children;
    Boolean isRoot;
}
