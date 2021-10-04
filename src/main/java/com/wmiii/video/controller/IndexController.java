package com.wmiii.video.controller;

import com.alibaba.fastjson.JSON;
import com.tencentcloudapi.vod.v20180717.models.FileUploadTask;
import com.wmiii.video.mapper.OptionDataMapper;
import com.wmiii.video.mapper.TeacherMapper;
import com.wmiii.video.mapper.WatchTimeMapper;
import com.wmiii.video.params.CourseVideoIdParam;
import com.wmiii.video.params.CourseVideoParam;
import com.wmiii.video.params.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/index")
public class IndexController {
    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private OptionDataMapper optionDataMapper;

    @Autowired
    private WatchTimeMapper watchTimeMapper;

    @GetMapping("/return_1")
    Result Return1() {
        return Result.success(1);
    }

    @GetMapping("/return_choices")
    Result ReturnChoices(@RequestBody CourseVideoIdParam param) {
        return Result.success(optionDataMapper.getChoiceData(param.getCourseId(), param.getVideoId()));
    }

    @GetMapping("/return_times")
    Result ReturnTimes(@RequestBody CourseVideoIdParam param) {
        return Result.success(null);
    }

    @PostMapping("/return_url")
    void ReturnUrl(@RequestBody FileUploadTask fileUploadTask) {
        System.out.println(JSON.toJSON(fileUploadTask));
    }
}
