package com.wmiii.video.service;

import com.alibaba.fastjson.JSONObject;
import com.wmiii.video.entity.CourseVideo;
import com.wmiii.video.params.Result;
import com.wmiii.video.params.UploadCourseParam;
import com.wmiii.video.params.UploadVideoParam;
import com.wmiii.video.params.UploadVideoParam2;

import java.util.List;

public interface CourseVideoService {
    Result findVideoByVideoId(Integer videoId, String token);

    Result submit(UploadVideoParam uploadVideoParam, String token);

    Long storeVideo(String videoName, Integer courseId, Integer teacherId, String fileType, Boolean isRoot);

    Long getVideoIdByOriginName(Integer courseId, String videoName);

    CourseVideo findVideoByVideoName(String videoName, Integer courseId);

    Integer deleteByVideoId(Long videoId);

    Boolean setBlankStructure(Integer videoId, Integer courseId, String fileType);

    // Result getStructureByCourseId(Integer courseId, String token);

    Result getVideoList(Integer courseId, String token);

    Integer setUrl(Integer videoId, String fileType);

    Result getRootVideo(Integer courseId, String token);

    Result deleteVideo(String token, Long videoId);

    // Result storeVideo2(JSONObject jsonObject);
    Result storeVideo2(String token, UploadVideoParam2 param);
}
