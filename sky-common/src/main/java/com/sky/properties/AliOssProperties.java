package com.sky.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sky.alioss")
@Data
public class AliOssProperties {

    private String endpoint;
    //获取环境变量中的值
    public String accessKeyId = System.getenv("OSS_ACCESS_KEY_ID");
    public String accessKeySecret = System.getenv("OSS_ACCESS_KEY_SECRET");
    private String bucketName;


}
