package com.ljm.util;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;

/**
 * Created by liujm on 2017/7/31.
 */
public class qiniuyunSDK {
    //构造一个带指定Zone对象的配置类
    public static void main(String[] args) throws Exception{
        Configuration cfg = new Configuration(Zone.zone2());
//...其他参数参考类注释

        UploadManager uploadManager = new UploadManager(cfg);
        //...生成上传凭证，然后准备上传
        String accessKey = "zSapXCbTCZlAfPLF1FKGdWDRplwctF2IVhef5iT2";
        String secretKey = "j_ZfQdGTghQeQKMUBwqFAdjjWS2-s67sGeV7yh0M";
        String bucket = "liujiaming";
        //如果是Windows情况下，格式是 D:\\qiniu\\test.png
        String localFilePath = "D:\\qqq.png";
        //默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = "qqq.png";

        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);


            Response response = uploadManager.put(localFilePath, key, upToken);
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println(putRet.key);
            System.out.println(putRet.hash);

        }
    }
