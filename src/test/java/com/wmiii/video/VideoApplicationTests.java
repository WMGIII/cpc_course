package com.wmiii.video;

import com.qcloud.vod.VodUploadClient;
import com.qcloud.vod.model.VodUploadRequest;
import com.qcloud.vod.model.VodUploadResponse;
import com.wmiii.video.params.WatchTimeParam;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.alibaba.fastjson.JSON;

@SpringBootTest
class VideoApplicationTests {

    @Test
    void contextLoads() {
        WatchTimeParam param = new WatchTimeParam();
        param.setVideoId(1);
        param.setCourseId(5);
        param.setMTime(3);
        System.out.println(JSON.toJSON(param));
    }

    @Test
    void uploadFile() {
        VodUploadClient client = new VodUploadClient("AKIDCEzUjiQr1wA7oFSP5UigOq30h8JFwNXR", "e17xXqtgDWbR2PYS8ZliS0MWR9cqpb9R");
        VodUploadRequest request = new VodUploadRequest();
        request.setMediaFilePath("/Users/yangfuqi/Music/nb.mp4");
        try {
            VodUploadResponse response = client.upload("ap-guangzhou", request);
            System.out.println( response.getFileId());
        } catch (Exception e) {
            // 业务方进行异常处理
            //logger.error("Upload Err", e);
        }
    }

}
