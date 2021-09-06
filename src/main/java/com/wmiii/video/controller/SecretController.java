package com.wmiii.video.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tencentcloudapi.vod.v20180717.models.FileUploadTask;
import com.wmiii.video.params.Result;
import com.wmiii.video.utils.CreateMacUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class SecretController {
    private CreateMacUtils sign = new CreateMacUtils();
    // 设置 App 的云 API 密钥

    @PostMapping("/secret_key")
    public Result getKey() {
        sign.setSecretId("AKIDCEzUjiQr1wA7oFSP5UigOq30h8JFwNXR");
        sign.setSecretKey("e17xXqtgDWbR2PYS8ZliS0MWR9cqpb9R");
        sign.setCurrentTime(System.currentTimeMillis() / 1000);
        sign.setRandom(new Random().nextInt(java.lang.Integer.MAX_VALUE));
        sign.setSignValidDuration(3600); // 签名有效期：1小时
        try {
            String signature = sign.getUploadSignature();
            return Result.success(signature);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail(0, "获取签名失败");
        }
    }

    @PostMapping("/callback")
    public void callBack(@RequestBody JSONObject task) {
        System.out.println("回调");
        System.out.println(task.toJSONString());
    }
}
