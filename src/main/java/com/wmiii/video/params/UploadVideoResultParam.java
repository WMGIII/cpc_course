package com.wmiii.video.params;

import lombok.Data;

@Data
public class UploadVideoResultParam {
    String videoName;
    String message;
    Long videoId;
    String url;
}
