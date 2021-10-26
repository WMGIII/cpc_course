package com.wmiii.video.controller;

import com.wmiii.video.params.Result;
import com.wmiii.video.params.UploadNoticeParam;
import com.wmiii.video.service.CourseNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courses/notice")
public class CourseNoticeController {
    @Qualifier("CourseNoticeService")
    @Autowired
    private CourseNoticeService courseNoticeService;

    @PostMapping("/{courseId}")
    public Result getAllNotices(@PathVariable Integer courseId) {
        return courseNoticeService.getAllNotices(courseId);
    }

    @PostMapping("/upload")
    public Result uploadNotice(@RequestBody UploadNoticeParam param) {
        return courseNoticeService.uploadNotice(param);
    }
}
