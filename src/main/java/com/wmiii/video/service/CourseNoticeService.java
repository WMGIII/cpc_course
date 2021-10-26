package com.wmiii.video.service;

import com.wmiii.video.params.Result;
import com.wmiii.video.params.UploadNoticeParam;

public interface CourseNoticeService {
    Result getAllNotices(Integer courseId);

    Result uploadNotice(UploadNoticeParam param);
}
