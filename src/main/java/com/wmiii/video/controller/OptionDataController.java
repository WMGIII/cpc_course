package com.wmiii.video.controller;

import com.wmiii.video.mapper.OptionDataMapper;
import com.wmiii.video.params.CourseVideoIdParam;
import com.wmiii.video.params.CourseVideoParam;
import com.wmiii.video.params.Result;
import com.wmiii.video.service.OptionDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/data")
public class OptionDataController {
    @Autowired
    private OptionDataService optionDataService;

    @PostMapping("/{courseId}/{videoId}/option")
    Result setChoiceData(@PathVariable Integer courseId, @PathVariable Integer videoId, @RequestHeader(value="Authorization", required = false) String token) {

        return optionDataService.makeChoice(token, courseId, videoId);
    }

    @PostMapping("/get/visit")
    Result getVisitData(@RequestHeader(value="Authorization", required = false) String token, @RequestBody CourseVideoIdParam param) {
        return null;
    }
}
