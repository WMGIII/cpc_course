package com.wmiii.video.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wmiii.video.entity.Course;
import com.wmiii.video.entity.CourseNotice;
import com.wmiii.video.mapper.CourseNoticeMapper;
import com.wmiii.video.params.Result;
import com.wmiii.video.params.UploadNoticeParam;
import com.wmiii.video.service.CourseNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Service("CourseNoticeService")
@Transactional
public class CourseNoticeServiceImpl implements CourseNoticeService {
    @Autowired
    private CourseNoticeMapper courseNoticeMapper;

    @Override
    public Result getAllNotices(Integer courseId) {
        LambdaQueryWrapper<CourseNotice> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(CourseNotice::getCourseId, courseId);
        return Result.success(courseNoticeMapper.selectList(queryWrapper));
    }

    @Override
    public Result uploadNotice(UploadNoticeParam param) {
        CourseNotice notice = new CourseNotice();
        notice.setCourseId(param.getCourseId());
        notice.setTitle(param.getTitle());
        notice.setDetail(param.getDetail());
        notice.setDate(System.currentTimeMillis());
        return Result.success(this.courseNoticeMapper.insert(notice));
    }
}
